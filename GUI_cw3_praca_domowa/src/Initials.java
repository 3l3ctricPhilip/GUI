public class Initials implements TwoStringsOper {

    @Override
    public String apply(String string1, String string2) {
        return "" + string1.charAt(0) + string2.charAt(0);
    }
}
