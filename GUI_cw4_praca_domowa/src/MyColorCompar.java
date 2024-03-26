import java.util.Comparator;

public class MyColorCompar implements Comparator<MyColor>{

    private ColComponent colComponent;

    public MyColorCompar(ColComponent colComponent) {
        this.colComponent = colComponent;
    }


    @Override
    public int compare(MyColor color1, MyColor color2) {
        switch (this.colComponent) {
            case RED:
                return color1.getRed() - color2.getRed();
            case GREEN:
                return color1.getGreen() - color2.getGreen();
            case BLUE:
                return color1.getBlue() - color2.getBlue();
            case NONE:
                return color1.getSumOfcolors() - color2.getSumOfcolors();
            default:
                throw new IllegalArgumentException("Nieznany składnik koloru");
        }
    }
}
