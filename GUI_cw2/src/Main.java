import Model.Circle;
import Model.Figure;
import Model.Rect;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Frame {
    public static void main(String[] args) {
        new Main();
    }

    private Figure[] figures;

    private int countFigures;

    Rect rect;

    public Main() {
        this.figures = new Figure[1000];
        this.countFigures = 0;

        for (int i = 0; i < 10; i++) {
            figures[countFigures++] = getFigure();
        }

        this.setSize(640, 480);
        this.setVisible(true);
        this.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );

        this.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        figures[countFigures++] = getFigure();
                        repaint();
                    }
                }
        );

    }

    public Figure getFigure() {
        return switch ((int)(Math.random()*2) ){
            case 0 -> new Rect(
                    (int)(Math.random()*640),
                    (int)(Math.random()*480),
                    30, 50
            );
            default -> new Circle(
                    (int)(Math.random()*640),
                    (int)(Math.random()*480),
                    25
            );
        };
    }

    public void paint(Graphics g){
        for(int i = 0; i<countFigures; i++){
            figures[i].draw(g);
        }
    }
}