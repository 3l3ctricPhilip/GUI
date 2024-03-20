public class Concat implements TwoStringsOper {
    @Override
    public String apply(String string1, String string2) {
        return string1 + string2;
    }
}
