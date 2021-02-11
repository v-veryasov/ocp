package pattern.po.Visitor;

import pattern.po.Visitor.visiters.BedVisiter;
import pattern.po.Visitor.visiters.Visitor;

public class Main {
    public static void main(String[] args) {
        Element[] elements = {new CustumWorker(), new TaxWorker(), new ULWorker()};

        Visitor visitor = new BedVisiter();
        for (int i = 0; i < elements.length; i++) {
            elements[i].accept(visitor);
        }
    }
}
