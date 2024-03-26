import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person persons[] = {
                new Person("Zenon", 98),
                new Person("Filip", 30),
                new Person("Ania", 29),
                new Person("Lucek", 666),
                new Person("Jan", 2137),
                new Person("Iza", 420)
        };

        System.out.println(Arrays.toString(persons));

        Person.sort(persons);

        System.out.println(Arrays.toString(persons));
    }
}
