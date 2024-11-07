package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Triangle extends BaseShape {
    private int base, height;

    public Triangle(int x, int y, Color color, int base, int height) {
        super(x, y, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        int[] xPoints = {x, x + (base / 2), x - (base / 2)};
        int[] yPoints = {y, y + height, y + height};
        g.fillPolygon(new Polygon(xPoints, yPoints, 3));
    }
}
