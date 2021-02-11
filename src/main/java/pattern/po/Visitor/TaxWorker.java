package pattern.po.Visitor;

import pattern.po.Visitor.visiters.Visitor;

public class TaxWorker implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
