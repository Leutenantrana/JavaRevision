package Streamss;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        // reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }

        // counting the number of values divisible by three
        long numbersDivisibleByThree = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number % 3 == 0)
                .count();

        // working out the average
        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        //

        long numbersDivisibleByfour = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number % 4 == 0)
                .count();
        //

        double sumOfAll = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .sum();
        // printing out the statistics
        System.out.println("Divisible by three " + numbersDivisibleByThree);
        System.out.println("Average number: " + average);
        System.out.println("Divisible by four " + numbersDivisibleByfour);
        System.out.println("sum of all  " + sumOfAll);

    }

    // Functions that handle stream elements ​​cannot change values ​​of variables
    // outside of the function

}
