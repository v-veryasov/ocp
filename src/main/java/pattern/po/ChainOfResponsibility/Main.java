package pattern.po.ChainOfResponsibility;

import pattern.po.ChainOfResponsibility.provider.Priority;

public class Main {
    public static void main(String[] args) {
        InfoLogger infoLogger = new InfoLogger(Priority.INFO);
        ErrorLogger errorLogger = new ErrorLogger(Priority.ERROR);
        infoLogger.setNext(errorLogger);

        infoLogger.loggerManager("** Тест 1 **", Priority.INFO);
        infoLogger.loggerManager("** Тест 2 **", Priority.DEBUG);
        infoLogger.loggerManager("** Тест 3 **", Priority.ERROR);
        System.out.println("END!");
    }
}
