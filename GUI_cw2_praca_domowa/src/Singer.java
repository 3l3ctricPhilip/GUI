public abstract class Singer {
    private String name;
    private int number;
    private static int counter = 1;

    public Singer(String name) {
        this.name = name;
        this.number = counter++;
    }
    abstract String sing();

    public String toString() {
        return "(" + number + ")" + name + ": " + sing();
    }
    public static String loudest(Singer[] singers) {
        int index = 0;
        int max = singers[0].sing().length();

        for (int i = 1; i < singers.length; i++) {

            if (singers[i].sing().length() > max) {
                max = singers[i].sing().length();
                index++;
            }
        }
        return "(" + singers[index].number + ")" + singers[index].name + ": " + singers[index].sing();
    }
}