package pattern.po.Mediator;

import pattern.po.Mediator.user.Admin;
import pattern.po.Mediator.user.SimpleUser;
import pattern.po.Mediator.user.User;

public class Main {
    public static void main(String[] args) {
        SimpleChat chat = new SimpleChat();

        User admin = new Admin(chat, "Ton");
        User user = new SimpleUser(chat, "Igor");
        chat.addAdmin(admin);
        chat.addUser(user);
        user.sendMessage("Hello!");
        admin.sendMessage("Attention!");
    }
}
