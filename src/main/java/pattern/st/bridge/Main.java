package pattern.st.bridge;

import pattern.st.bridge.dto.Blue;

public class Main {
    public static void main(String[] args) {
        Blue blue = new Blue();
        System.out.println(new Square(blue).draw());
    }
}
