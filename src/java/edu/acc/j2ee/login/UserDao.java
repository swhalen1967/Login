package edu.acc.j2ee.login;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class UserDao {
    private static final List<User> USERS = new ArrayList<>();   
    private static final Pattern USER_PATTERN = Pattern.compile("^\\w{6,12}$");
    private static final Pattern PASS_PATTERN = Pattern.compile("^[\\w\\.-]{8,16}$");
    
    public static boolean addUser(User user) {
        return USERS.add(user);
    }
    
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
}
