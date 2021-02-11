package pattern.po.Visitor;

import pattern.po.Visitor.visiters.Visitor;

public class ULWorker implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
