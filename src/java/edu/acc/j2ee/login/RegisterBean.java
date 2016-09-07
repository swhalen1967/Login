package edu.acc.j2ee.login;

public class RegisterBean {
    private String user;
    private String pass1;
    private String pass2;
    
    public RegisterBean() {}
    
    public RegisterBean(String user, String pass1, String pass2) {
        this.user = user;
        this.pass1 = pass1;
        this.pass2 = pass2;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass1() {
        return pass1;
    }

    public void setPass1(String pass1) {
        this.pass1 = pass1;
    }

    public String getPass2() {
        return pass2;
    }

    public void setPass2(String pass2) {
        this.pass2 = pass2;
    }
}
