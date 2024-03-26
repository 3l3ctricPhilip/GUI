public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return this.age - person.age;
    }

    public static void sort(Person[] persons) {
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < persons.length - 1; i++) {
                if (persons[i].compareTo(persons[i + 1]) > 0) {

                    Person temp = persons[i];
                    persons[i] = persons[i + 1];
                    persons[i + 1] = temp;
                    swap = true;
                }
            }
        } while (swap);
    }
}