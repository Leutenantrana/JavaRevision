package OOP;

import java.util.Scanner;

public class Tries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter name and age seperated by a coma: ");
            String line = scanner.nextLine();

            if (line.equals("")) {
                break;

            }
            String[] parts = line.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);

            System.out.println("Name : " + name);
            System.out.println("age : " + age);

        }
    }
}
