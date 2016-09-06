package edu.acc.j2ee.login;

public class User implements java.io.Serializable {
    private String user;
    private String pass;
    
    public User(String uname, String upass) {
        user = uname;
        pass = upass;
    }
    
    public User() {}

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
