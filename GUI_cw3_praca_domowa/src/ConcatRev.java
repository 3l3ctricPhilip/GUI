public class ConcatRev implements TwoStringsOper {
    @Override
    public String apply(String string1, String string2) {
        return string2+string1;
    }
}
