package team.redrock.messageBoard.entity;

import java.io.Serializable;

public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    private String message_id;
    private  User user;
    private  String message_content;
    private  String message_time;

    public Message(){}
    public Message(String message_content, String message_time,User user) {
        this.message_content =message_content;
        this.user =user;
        this.message_time =message_time;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }

    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage_time() {
        return message_time;
    }

    public void setMessage_time(String message_time) {
        this.message_time = message_time;
    }


}
