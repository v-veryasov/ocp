package pattern.st.flyweight;

import pattern.st.flyweight.dto.LinPS;
import pattern.st.flyweight.dto.PS;
import pattern.st.flyweight.dto.WinPS;

import java.util.HashMap;
import java.util.Map;

public class FactoryPS {
    private static final Map<String, PS> map = new HashMap<>();

    public static PS getMap(String key) {
        PS ps = map.get(key);

        if (ps == null) {
            switch (key) {
                case "Win":
                    ps = new WinPS();
                    break;
                case "Lin":
                    ps = new LinPS();
                    break;
                default:
                    new IllegalArgumentException("Not find!");
            }
            map.put(key, ps);
        }
        return ps;
    }
}
