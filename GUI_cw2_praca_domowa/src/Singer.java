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

    /*public static String loudest(Singer[] singers) {
        int index = 0;
        int maxCapitalLetters = 0;
        for (int i = 0; i < singers.length; i++) {
            int capitalLetters = countCapitalLetters(singers[i].sing());
            if (capitalLetters > maxCapitalLetters) {
                maxCapitalLetters = capitalLetters;
                index = i;
            }
        }
        return singers[index].toString();
    }

    private static int countCapitalLetters(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }*/

    public static String loudest(Singer[] singers) {
        int count = 0;
        int max = 0;
        int index = -1;
        for (int i = 0; i < singers.length; i++) {
            count = 0;
            for (int j = 0; j < singers[i].sing().length(); j++) {
                if (Character.isUpperCase(singers[i].sing().charAt(j))) {
                    count++;
                }
            }
            if (count > max) {
                index++;
                max = count;
            }
        }
        return "(" + singers[index].number + ")" + singers[index].name + ": " + singers[index].sing();
    }
}