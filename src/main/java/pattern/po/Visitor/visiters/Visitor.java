package pattern.po.Visitor.visiters;

import pattern.po.Visitor.CustumWorker;
import pattern.po.Visitor.TaxWorker;
import pattern.po.Visitor.ULWorker;

public interface Visitor {
    void visit(TaxWorker worker);
    void visit(CustumWorker worker);
    void visit(ULWorker worker);
}
