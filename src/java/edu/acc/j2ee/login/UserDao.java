package edu.acc.j2ee.login;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class UserDao {
    private static final List<User> USERS = new ArrayList<>();   
    private static final Pattern USER_PATTERN = Pattern.compile("^\\w{6,12}$");
    private static final Pattern PASS_PATTERN = Pattern.compile("^[\\w\\.-]{8,16}$");
    
    public static boolean validates(User user) {
        if (user.getUser() == null || user.getPass() == null)
            return false;
        if (!USER_PATTERN.matcher(user.getUser()).matches())
            return false;
        return PASS_PATTERN.matcher(user.getPass()).matches();
    }
    
    public static boolean authentic(User user) {
        for (User u : USERS) {
            if (u.getUser().equals(user.getUser()) &&
                    u.getPass().equals(user.getPass()))
                return true;
        }
        return false;
    }
    
    public static String validateRegistration(RegisterBean reg) {
        if (reg.getUser() == null || reg.getPass1() == null || reg.getPass2() == null)
            return "Some fields were empty";
        if (!reg.getPass1().equals(reg.getPass2()))
            return "Passwords don't match";
        if (!USER_PATTERN.matcher(reg.getUser()).matches())
            return "User name is invalid";
        if (!PASS_PATTERN.matcher(reg.getPass1()).matches())
            return "Password is invalid";
        return null;
    }
    
    public synchronized static boolean register(RegisterBean reg) {
        for (User u : USERS) {
            if (u.getUser().equals(reg.getUser()))
                return false;
        }
        User newUser = new User(reg.getUser(), reg.getPass1());
        USERS.add(newUser);
        return true;
    }
}
