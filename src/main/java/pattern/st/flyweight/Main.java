package pattern.st.flyweight;

import pattern.st.flyweight.dto.PS;

public class Main {
    public static void main(String[] args) {
        PS ps = FactoryPS.getMap("Win");
        ps.on();
    }
}
