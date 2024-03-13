package Model;

import java.awt.*;

public class Rect extends Figure {
    protected int sideA, sideB;
    public Rect(int x, int y, int sideA, int sideB) {
        super(x,y);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public void draw(Graphics g){
        g.fillRect(x, y, sideA, sideB);
        g.setColor(color);
    }
}
