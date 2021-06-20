package pattern.po.Memento;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.setParams(12_000, "25X");
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.setParams(15_000, "26X");

        game.load(file.getSave());
        System.out.println(game);
    }
}
