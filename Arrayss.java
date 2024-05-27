import java.util.Scanner;

// Experiment 1
// public class Arrayss {
//     // public static void main(String[] args) {
//     //     Scanner scanner = new Scanner(System.in);
//     //     int[] numbers = new int[5];

//     //     System.out.println(numbers);
//     //     int index = 0;
//     //     while (index < numbers.length) {
//     //         System.out.println("Enter the number");
//     //         numbers[index] = Integer.valueOf(scanner.nextLine());
//     //         index++;

//     //     }
//     //     int i = 0;
//     //     while (i < numbers.length) {
//     //         System.out.println(numbers[i]);
//     //         i++;
//     //     }

//     // }

// }

// Experiment 2 ::

// public class Arrayss {
//     public static void main(String[] args) {
//         double[] marks = new double[5];
//         marks[0] = 67.00;
//         marks[1] = 75.00;
//         marks[2] = 72.00;
//         marks[3] = 82.00;
//         marks[4] = 98.00;
//         listElement(marks);
//         int[] array = { 1, 2, 3, 4, 5, 6 };
//         printArrayInStars(array);

//     }

//     public static void listElement(double[] items) {
//         int i = 0;
//         while (i < items.length) {
//             System.out.println(items[i]);
//             i++;
//         }
//     }

//     public static void printArrayInStars(int[] array) {
//         for (int number : array) {
//             for (int i = 0; i < number; i++) {
//                 System.out.print("*");

//             }
//             System.out.println();
//         }
//     }
// }

// Experiment 3 ::

public class Arrayss {
    public static void main(String[] args) {
        String[] subjects = { "Physics", "Chemistry", "Mathematics", "English", "Phy Ed" };
        int[] marks = { 67, 75, 72, 82, 98 };
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + " : " + marks[i]);

        }

    }
}
