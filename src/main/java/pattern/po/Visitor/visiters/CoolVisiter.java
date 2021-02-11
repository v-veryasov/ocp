package pattern.po.Visitor.visiters;

import pattern.po.Visitor.CustumWorker;
import pattern.po.Visitor.TaxWorker;
import pattern.po.Visitor.ULWorker;

public class CoolVisiter implements Visitor {
    @Override
    public void visit(TaxWorker worker) {
        System.out.println("Работа с налогами клиента... ");
    }

    @Override
    public void visit(CustumWorker worker) {
        System.out.println("Работа с клиентом... ");
    }

    @Override
    public void visit(ULWorker worker) {
        System.out.println("Работа с клиентом как с UL ... ");
    }
}
