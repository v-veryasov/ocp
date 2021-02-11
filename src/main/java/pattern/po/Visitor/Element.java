package pattern.po.Visitor;

import pattern.po.Visitor.visiters.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
