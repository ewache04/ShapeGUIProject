import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Hexagon extends Shape {
    private int radius;

    public Hexagon(int x, int y, Color color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        Polygon hexagon = new Polygon();
        for (int i = 0; i < 6; i++) {
            hexagon.addPoint(
                    x + (int) (radius * Math.cos(i * 2 * Math.PI / 6)),
                    y + (int) (radius * Math.sin(i * 2 * Math.PI / 6))
            );
        }
        g.fillPolygon(hexagon);
    }
}
