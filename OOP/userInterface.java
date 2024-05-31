package OOP;

import java.util.Scanner;

public class userInterface {

    public void start() {
        Scanner reader = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = reader.nextLine();
        System.out.println("What's your age?");
        int age = Integer.valueOf(reader.nextLine());
        System.out.println("What's your weight?");
        double weight = Double.valueOf(reader.nextLine());
        System.out.println("What's your height?");
        double height = Double.valueOf(reader.nextLine());

        Person person = new Person(name, age, height, weight);
        System.out.println(person);

    }
}
