import java.util.Random;
import java.util.Scanner;

// public class Program {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("write your text");
//         String message = scanner.nextLine();
//         System.out.println("your text was " + message);
//     }

// }

// public class Program1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Greetings! How are you doing?");
//         String message1 = scanner.nextLine();
//         System.out.println("Oh, how interesting. Tell me more!");
//         String message2 = scanner.nextLine();
//         System.out.println("Thanks for sharing");

//     }
// }

// Variables //
// Variables are containers which are used to store values

// public class variabless {
//     public static void main(String[] args) {
//         int wholeNumber = 123;
//         String name = "sagar rana";
//         double floatingNumber = 1.23;
//         boolean trueorfalse = true;
//         System.out.println("The integer variable holds the value : " + wholeNumber);
//         System.out.println("The String varibale holds the value : " + name);
//         wholeNumber = 12;
//         System.out.println("The value after changing the variable wholenumber is " + wholeNumber);

//     }
// }

// Java allows integer tobe stored in a double but vice versa is not possible

// public class as {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Write a value ");
//         int value = Integer.valueOf(scanner.nextLine());
//         System.out.println("You wrote " + value);

//         System.out.println("Write a value ");
//         int value2 = Integer.valueOf(scanner.nextLine());
//         System.out.println("You wrote " + value2);

//     }
// }

// In Java terminology for naming the variables is to be choosen very cautiously

// int double = 123; // this can't be used
// int System.out.print = 12; // this can't be used
// int last day of month = 12; //spacing can't be used
// int beware! = 12; //exclamatory mark can't be used

// public class Program {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//         int factorial = 1;
//         System.out.println("Give a number :");
//         int number = Integer.valueOf(scanner.nextLine());
//         while (true) {
//             int i = 1;

//             if (i > number || number < 0) {
//                 break;

//             }
//             factorial = factorial * i;
//             i += 1;

//         }
//         System.out.println("the factorial is : " + factorial);
//     }
// }

// public class Program {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//         // int i = 1;
//         int factorial = 1;
//         System.out.println("Give a number :");
//         int number = Integer.valueOf(scanner.nextLine());

//         // while (i <= number) {
//         // factorial = factorial * i;
//         // i += 1;
//         // }
//         while (number > 1) {
//             factorial = factorial * number;
//             number--;

//         }
//         System.out.println("the factorial is :" + factorial);
//     }
// }

// public class Program {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int sum = 0;
//         int invalidNumber = 0;
//         int validNumber = 0;
//         int average = 0;
//         while (true) {
//             System.out.println("write the number");
//             int number = Integer.valueOf(scanner.nextLine());

//             if (number == 0) {
//                 System.out.println("the sum is : " + sum);
//                 System.out.println("The number of invalid numbers is : " + invalidNumber);
//                 System.out.println("The number of invalid numbers is : " + validNumber);
//                 System.out.println("the average of valid numbers is : " + average);
//                 break;

//             }

//             if (number < 0) {
//                 invalidNumber++;
//                 continue;

//             }

//             sum += number;
//             validNumber++;
//             average = sum / validNumber;

//         }
//     }
// }

// public class Program {

//     public static void main(String[] args) {
//         System.out.println("we are in the main method");
//         int number = greet();
//         System.out.println("blah blah blah " + number + " times");

//     }

//     public static int greet() {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("How many times did you do it?");
//         int number = Integer.valueOf(scanner.nextLine());
//         return number;

//     }
// }

// public class Program {
//     public static void main(String[] args) {
//         greet(12, "Sagar Rana");
//         division(30, 15);
//         divisibleByThreeInRange(3, 6);
//     }

//     public static void greet(int numberOfTimes, String name) {

//         int i = 0;
//         while (i < numberOfTimes) {
//             System.out.println("Greetings " + name + " " + i);
//             i++;

//         }

//     }

//     public static void division(int numerator, int denominator) {
//         System.out.println("the division is " + numerator / denominator);
//     }

//     public static void divisibleByThreeInRange(int beginning, int end) {

//         while (beginning <= end) {

//             if (beginning % 3 == 0) {
//                 System.out.println(beginning);

//             }
//             beginning++;

//         }
//     }
// }

import java.util.random.*;

// public class Program {
//     public static void main(String[] args) {
//         System.out.println("Your lucky number is " + randomNumber());

//     }

//     public static int randomNumber() {
//         Random random = new Random();
//         return random.nextInt(11);

//     }
// }

// public class CoinToss {
//     public static void main(String[] args) {

//         System.out.println("the result is " + numbera());
//     }

//     public static String numbera() {
//         Random random = new Random();
//         int number = random.nextInt(10);
//         if (number < 6) {
//             return "heads";

//         } else {
//             return "trails";
//         }

//     }
// }

public class Program {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Customer number: ");
        int y = Integer.valueOf(x.nextLine());

        if (y >= 1000 && y % 25 == 0 && y % 2000 != 0) {
            System.out.println("Gets a gift card!");
        } else if (y % 2000 == 0) {
            System.out.println("Gets a large gift card!");
        } else {
            System.out.println("Gets nothing.");
        }
    }
}