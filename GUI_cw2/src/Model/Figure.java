package Model;

import java.awt.*;

public abstract class Figure {
    protected int x,y;

    protected Color color;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255));
    }
    abstract public void draw(Graphics g);
}
