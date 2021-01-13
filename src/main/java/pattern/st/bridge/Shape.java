package pattern.st.bridge;

import pattern.st.bridge.dto.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public String draw();
}