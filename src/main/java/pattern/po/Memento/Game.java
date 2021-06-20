package pattern.po.Memento;

public class Game {
    private int ms;
    private String level;

    public void setParams(int ms, String level) {
        this.ms = ms;
        this.level = level;
    }

    public int getMs() {
        return ms;
    }

    public String getLevel() {
        return level;
    }

    public void load(Save save) {
        this.ms = save.getMs();
        this.level = save.getLevel();
    }

    public Save save() {
       return new Save(ms, level);
    }

    @Override
    public String toString() {
        return "Game{" +
                "ms=" + ms +
                ", level='" + level + '\'' +
                '}';
    }
}
