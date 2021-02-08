package pattern.po.Mediator.user;

import pattern.po.Mediator.Chat;

public class Admin implements User {

    Chat chat;
    String name;

    public Admin(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " receiving message: " + message);
    }
}
