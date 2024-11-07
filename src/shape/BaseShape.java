package shape;

import java.awt.Color;
import java.awt.Graphics;

public abstract class BaseShape {
    protected int x, y;
    protected Color color;

    public BaseShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void draw(Graphics g);
}
