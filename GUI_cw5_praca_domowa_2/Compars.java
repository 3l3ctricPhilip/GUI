import java.util.Arrays;
import java.util.Comparator;

class MyComp implements Comparator<Integer> {
    public static final int
            BY_VAL = 0, BY_VAL_REV = 1,
            BY_NUM_OF_DIVS = 2, BY_SUM_OF_DIGS = 3;

    private int typeOfSort;

    public MyComp(int typeOfSort) {
        if (typeOfSort != BY_VAL && typeOfSort != BY_VAL_REV && typeOfSort != BY_NUM_OF_DIVS && typeOfSort != BY_SUM_OF_DIGS) {
            throw new IllegalArgumentException("Nieprawidłowa wartość dla typu sortowania");
        }
        this.typeOfSort = typeOfSort;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        switch (this.typeOfSort) {
            case 0:
                return o1 - o2;
            case 1:
                return o2 - o1;
            case 2:
                int divsO1 = countDivisors(o1);
                int divsO2 = countDivisors(o2);

                if (divsO1 == divsO2) {
                    return o1 - o2;
                } else return divsO1 - divsO2;
            case 3:
                int sum01 = sumOfDigit(o1);
                int sum02 = sumOfDigit(o2);

                if (sum01 == sum02) {
                    return o1 - o2;
                } else return sum01 - sum02;

        }
        return 0;
    }

    private static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    private static int sumOfDigit(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}


public class Compars {
    public static void main(String[] args) {
        Integer[] a = {1, 5, 33, 12, 98, 15};
        printTable("Original    ", a);

        Arrays.sort(a, new MyComp(MyComp.BY_VAL));
        printTable("ByVal       ", a);

        Arrays.sort(a, new MyComp(MyComp.BY_VAL_REV));
        printTable("ByValRev    ", a);

        Arrays.sort(a, new MyComp(MyComp.BY_NUM_OF_DIVS));
        printTable("ByNumOfDivs ", a);

        Arrays.sort(a, new MyComp(MyComp.BY_SUM_OF_DIGS));
        printTable("BySumOfDigs ", a);
    }

    static void printTable(String mess, Integer[] a) {
        System.out.print(mess + "[ ");
        for (int d : a) System.out.print(d + " ");
        System.out.print("]\n");
    }
}

