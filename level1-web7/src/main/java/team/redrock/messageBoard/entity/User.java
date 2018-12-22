
package team.redrock.messageBoard.entity;


public class User {
    private String user_id;
    private String user_account;
    private String user_pwd;

    public User(){}


    public User(String  user_id,String user_account, String user_pwd)
    {
        this.user_id = user_id;
        this.user_pwd = user_pwd;
        this.user_account = user_account;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_account() {
        return user_account;
    }

    public void setUser_account(String user_account) {
        this.user_account = user_account;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

}
