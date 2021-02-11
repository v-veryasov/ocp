package pattern.po.Visitor.visiters;

import pattern.po.Visitor.CustumWorker;
import pattern.po.Visitor.TaxWorker;
import pattern.po.Visitor.ULWorker;

public class BedVisiter implements Visitor {
    @Override
    public void visit(TaxWorker worker) {
        System.out.println("Работа с налогами должника ... ");
    }

    @Override
    public void visit(CustumWorker worker) {
        System.out.println("Работа с должником... ");
    }

    @Override
    public void visit(ULWorker worker) {
        System.out.println("Работа с должником как с UL ... ");
    }
}