package team.redrock.messageBoard.servlet;



import team.redrock.messageBoard.dao.MessageDao;
import team.redrock.messageBoard.entity.Message;
import team.redrock.messageBoard.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
@WebServlet("/work/MessageAddServlet")
public class MessageAddServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        PrintWriter out = null;
        try {
            out = response.getWriter();

        HttpSession  session = request.getSession();
        User user = (User) session.getAttribute("user");

            if (user == null) {
                request.getRequestDispatcher("/work/index.jsp").forward(request, response);
                return;
            }
            SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String content = request.getParameter("content");
            Message message = new Message(content, time.format(new Date()), user);
            MessageDao md = new MessageDao();
            int count = md.addMessage(message);
            if (count == 1) {
                request.getRequestDispatcher("/work/MessageServlet").forward(request, response);
            } else {
                out.println("<script>alert('留言失败');</script>");
            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (ServletException e) {
            e.printStackTrace();
        }

    }
}
