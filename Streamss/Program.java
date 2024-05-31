package Streamss;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        long count = persons.stream()
                .filter(person -> person.getBirthYear() < 1970)
                .count();

        //
        System.out.println("Count: " + count);

        //

        // number of people whose name starts with A

        long countAgain = persons.stream()
                .filter(person -> person.getName().startsWith("A"))
                .count();
        //

        persons.stream()
                .map(person -> person.getFirstName())
                .distinct()
                .sorted()
                .forEach(name -> System.out.println(name));

    }

}
