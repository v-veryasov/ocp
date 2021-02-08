package pattern.po.Mediator;

import pattern.po.Mediator.user.User;

public interface Chat {
    void sendMessage(String message, User from);

}
