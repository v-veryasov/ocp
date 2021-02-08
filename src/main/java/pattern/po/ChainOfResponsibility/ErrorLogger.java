package pattern.po.ChainOfResponsibility;

import pattern.po.ChainOfResponsibility.provider.Priority;

public class ErrorLogger extends Logger {

    public ErrorLogger(Priority priority) {
        super(priority);
    }

    @Override
    protected void write(String s) {
        System.out.println("ERROR ---- " + s);
    }
}