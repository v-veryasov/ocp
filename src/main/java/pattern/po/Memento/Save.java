package pattern.po.Memento;

public class Save {
    private int ms;
    private String level;

    public Save(int ms, String level) {
        this.ms = ms;
        this.level = level;
    }

    public int getMs() {
        return ms;
    }

    public String getLevel() {
        return level;
    }
}
