package pattern.po.ChainOfResponsibility.provider;

public enum Priority {
    INFO(1),
    DEBUG(2),
    ERROR(3);

    private int level;

    Priority(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
