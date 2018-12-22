
package team.redrock.messageBoard.servlet;

import team.redrock.messageBoard.dao.UserDao;
import team.redrock.messageBoard.entity.User;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class UserLoginServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request ,HttpServletResponse response){

        String account = request.getParameter("account");
        String pwd = request.getParameter("pwd");
        UserDao ud = new UserDao();
        User user = ud.getUser(account,pwd);
        HttpSession session = request.getSession();
        session.setAttribute("user",user);

        try {
            request.getRequestDispatcher("/work/message.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
