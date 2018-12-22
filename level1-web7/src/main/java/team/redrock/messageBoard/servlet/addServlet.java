package servlet;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.UUID;

@WebServlet("/work/addServlet")
public class addServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        String action = request.getParameter("action");
        if (action != null && action.equals("add")) {

           //生成用户唯一id
            int machineId = 1;
            int hashCodeV = UUID.randomUUID().toString().hashCode();
            if(hashCodeV < 0){
                hashCodeV = - hashCodeV;
            }
            String  user_id  =(machineId + String.format("%015d", hashCodeV));

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            String sql = "insert into user_info(user_account,user_pwd,user_id) values(?,?,?)";
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/webwork"
                                + "?serverTimezone=GMT%2B8",
                        "root",
                        "0405duanQWER789");

                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, request.getParameter("userName"));
                pstmt.setString(2, request.getParameter("password"));
                pstmt.setString(3, user_id);
                pstmt.executeUpdate();
                pstmt.close();
                response.sendRedirect("index.jsp");

            } catch (SQLException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
