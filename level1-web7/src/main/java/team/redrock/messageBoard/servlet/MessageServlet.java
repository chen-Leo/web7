
package team.redrock.messageBoard.servlet;

import team.redrock.messageBoard.dao.MessageDao;
import team.redrock.messageBoard.entity.Message;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
@WebServlet("/work/MessageServlet")
public class MessageServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request , HttpServletResponse response) {
        HttpSession session = request.getSession();
        MessageDao md = new MessageDao();
        List<Message> eml = md.meList();
        session.setAttribute("meList",eml);
        try {
            request.getRequestDispatcher("/work/message.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
