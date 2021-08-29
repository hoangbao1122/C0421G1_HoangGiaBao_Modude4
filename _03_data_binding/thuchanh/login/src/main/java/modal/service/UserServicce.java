package modal.service;

import modal.bean.Login;
import modal.bean.User;

import java.util.ArrayList;
import java.util.List;

public class UserServicce {
    private static final List<User> list;

    static {
        list = new ArrayList<>();
        list.add(new User("bao", "hoangbaoasd", "bao", "hoangboasd@gmail.com", 21));
    }

    public static User checkLogin(Login login) {
        for (User user : list) {
            if (user.getAccount().equals(login.getUsername()) && user.getPassword().equals(login.getPass())){
                return user;
            }
        }
        return null;
    }
}
