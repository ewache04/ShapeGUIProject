import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Star extends Shape {
    private int radius;

    public Star(int x, int y, Color color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        Polygon star = new Polygon();
        for (int i = 0; i < 10; i++) {
            double angle = i * Math.PI / 5;
            int r = (i % 2 == 0) ? radius : radius / 2;
            star.addPoint(
                    x + (int) (r * Math.cos(angle)),
                    y + (int) (r * Math.sin(angle))
            );
        }
        g.fillPolygon(star);
    }
}
