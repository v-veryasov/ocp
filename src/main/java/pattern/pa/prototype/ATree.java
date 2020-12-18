package pattern.pa.prototype;

public class ATree extends Tree {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Tree clone() {
        ATree tree = new ATree();
        tree.setName("A - apple");
        return tree;
    }
}
