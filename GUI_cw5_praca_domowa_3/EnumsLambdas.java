import java.util.Arrays;
import java.util.Comparator;

// enums, class Person

public class EnumsLambdas {

    // printArray static function

    public static void main(String[] args) {
        Person[] persons = {
                new Person("Max", Sex.M, Size.XL, Country.NL),
                new Person("Jan", Sex.M, Size.S, Country.PL),
                new Person("Eva", Sex.F, Size.XS, Country.NL),
                new Person("Lina", Sex.F, Size.L, Country.DE),
                new Person("Mila", Sex.F, Size.S, Country.DE),
                new Person("Ola", Sex.F, Size.M, Country.PL),
        };

        Comparator<Person> sexThenSize = (person1, person2) -> {
            if (person1.getSex() == person2.getSex()) {
                return person1.getSize().compareTo(person2.getSize());
            };
            return person1.getSex().compareTo(person2.getSex());
        };
        Arrays.sort(persons, sexThenSize);
        printArray("Persons by sex and then size", persons);

       Arrays.sort(persons, (person1, person2)->{
           if (person1.getSize() == person2.getSize()) {
               return person1.getName().compareTo(person2.getName());
           };
           return person1.getSize().compareTo(person2.getSize());
       });
        printArray("Persons by size and then name", persons);

        Country[] countries = Country.values();
        Arrays.sort(countries, (country1, country2)->{
            return country1.getFullName().compareTo(country2.getFullName());
        });
        printArray("Countries by name", countries);


    }

    public static <T> void printArray(String title, T[] tab) {
        System.out.println("*** " + title + " ***");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
