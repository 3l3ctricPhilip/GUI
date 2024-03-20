public class InterS {
    public static void main(String[] args) {

        TwoStringsOper concat = new Concat();
        TwoStringsOper concatRev = new ConcatRev();
        TwoStringsOper initials = new Initials();
        TwoStringsOper delimiter = new Delimiter(" loves ");

        System.out.println(concat.apply("Mary", "John"));
        System.out.println(concatRev.apply("Mary", "John"));
        System.out.println(initials.apply("Mary", "John"));
        System.out.println(delimiter.apply("Mary", "John"));

    }
}
