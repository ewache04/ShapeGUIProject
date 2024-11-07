import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {
    private int size;

    public Square(int x, int y, Color color, int size) {
        super(x, y, color);
        this.size = size;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x - size / 2, y - size / 2, size, size);
    }
}
