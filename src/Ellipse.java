import java.awt.Color;
import java.awt.Graphics;

public class Ellipse extends Shape {
    private int width, height;

    public Ellipse(int x, int y, Color color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - width / 2, y - height / 2, width, height);
    }
}
