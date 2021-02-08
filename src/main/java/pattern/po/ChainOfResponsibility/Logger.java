package pattern.po.ChainOfResponsibility;

import pattern.po.ChainOfResponsibility.provider.Priority;

public abstract class Logger {

    private Priority priority;
    private Logger next;

    public Logger(Priority priority) {
        this.priority = priority;
    }

    protected void setNext(Logger next) {
        this.next = next;
    }

    public void  loggerManager(String message, Priority priorSet) {
        if (priority == priorSet) {
            write(message);
        }
        if (next != null) {
            next.loggerManager(message, priorSet);
        }
    }
    protected abstract void write(String s);
}
