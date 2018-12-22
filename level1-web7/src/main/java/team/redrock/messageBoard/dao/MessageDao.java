package team.redrock.messageBoard.dao;
import team.redrock.messageBoard.entity.Message;
import team.redrock.messageBoard.entity.User;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class MessageDao {


    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet re = null;

    public int addMessage(Message message) {
        int i = 0;
        try {

                Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/webwork"
                            + "?serverTimezone=GMT%2B8",
                    "root",
                    "0405duanQWER789");
            String sql = "insert into message_info(user_id,messgae_content,message_time) values(?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, message.getUser().getUser_id());
            pstmt.setString(2, message.getMessage_content());
            pstmt.setString(3, message.getMessage_time());
            i = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public List<Message> meList() {
        List <Message> meList  = new ArrayList<Message>();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/webwork"
                            + "?serverTimezone=GMT%2B8",
                    "root",
                    "0405duanQWER789");
            String sql = "select * from message_info,user_info where messgage_info.used_id = user_info.user_id";
            pstmt = con.prepareStatement(sql);
            re=pstmt.executeQuery();
            while(re.next()) {
                Message message = new Message();
                message.setMessage_content(re.getString("message_content"));
                message.setMessage_id(re.getString("message_id"));
                message.setMessage_time(re.getString("message_time"));
                User user = new User();
                user.setUser_account(re.getString("user_account"));
                user.setUser_id(re.getString("user_id"));
                user.setUser_pwd(re.getString("user_pwd"));
                message.setUser(user);
                meList.add(message);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return meList;
    }
}
