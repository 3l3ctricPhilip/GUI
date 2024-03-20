public class Delimiter implements TwoStringsOper {

    private String delimiter;

    public Delimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public String apply(String string1, String string2) {
        return string1 + " " + delimiter + " " + string2;
    }
}
