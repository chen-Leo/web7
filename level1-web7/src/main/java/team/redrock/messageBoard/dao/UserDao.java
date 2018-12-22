
package team.redrock.messageBoard.dao;


import team.redrock.messageBoard.entity.User;

import java.sql.*;

public class UserDao {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet re = null;

    public User getUser(String account, String pwd) {
        User user = new User();

        try
        {

                Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/webwork"
                            + "?serverTimezone=GMT%2B8",
                    "root",
                    "0405duanQWER789");
            String sql = "selelct * from user_info where user_account = ? and user_pwd = ?";
            pstmt= con.prepareStatement(sql);
            pstmt.setString(1,account);
            pstmt.setString(2,pwd);
            re= pstmt.executeQuery();
            while (re.next()) {
                user.setUser_account(re.getString("user_account"));
                user.setUser_id(re.getString("user_id"));
                user.setUser_pwd(re.getString("user_pwd"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
}