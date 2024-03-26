import java.awt.*;

public class MyColor extends Color implements Comparable<MyColor>{
    private int sumOfcolors;

    public MyColor(int r, int g, int b) { //WALIDACJA DANYCH
        super(r, g, b);
        this.sumOfcolors = r + g + b;
    }

    public int getSumOfcolors() {
        return sumOfcolors;
    }

    @Override
    public String toString() {
        return "(" + getRed() + "," + getGreen() + "," + getBlue() + ")";
    }

    @Override
    public int compareTo(MyColor color) {
        return this.sumOfcolors - color.sumOfcolors;
    }
}
