package pattern.po.ChainOfResponsibility;

import pattern.po.ChainOfResponsibility.provider.Priority;

public class InfoLogger extends Logger {

    public InfoLogger(Priority priority) {
        super(priority);
    }

    @Override
    protected void write(String s) {
        System.out.println("INFO: ----- " + s);
    }
}
