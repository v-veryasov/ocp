package pattern.po.Mediator;

import pattern.po.Mediator.user.User;

import java.util.ArrayList;
import java.util.List;

public class SimpleChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void addUser(User user) {
        this.users.add(user);
    }

    public void addAdmin(User user) {
        this.admin = user;
    }

    @Override
    public void sendMessage(String message, User from) {
        users.forEach(user -> {
            if (user != from) {
                user.receive(message);
            }
        });
        admin.receive(message);
    }
}
