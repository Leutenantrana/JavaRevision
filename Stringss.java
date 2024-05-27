import java.util.Scanner;
import java.util.ArrayList;

public class Stringss {
    // Experiment 1 :: Concatenation ::

    // public static void main(String[] args) {
    // String name = "Sagar";
    // String surname = "Rana";
    // String fullName = name + surname;

    // System.out.println(fullName);
    // }

    // Experiment 2 :: Comaparisons and Equals ::

    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // String[] username = new String[2];
    // String[] password = new String[2];
    // username[0] = "sagar";
    // username[1] = "rana";
    // password[0] = "@sagar";
    // password[1] = "@rana";

    // System.out.print("Enter username: ");
    // String user = scanner.nextLine();

    // System.out.print("Enter password: ");
    // String pass = scanner.nextLine();
    // boolean loginSuccess = false;
    // for (int i = 0; i < username.length; i++) {
    // if (username[i].equals(user) && password[i].equals(pass)) {
    // loginSuccess = true;
    // break;
    // }
    // }
    // if (loginSuccess) {
    // System.out.println("You have successfully logged in!");

    // } else {
    // System.out.println("Incorrect username or password!");
    // }

    // }

    // Experiment 3 :: Splitting a String ::

    public static void main(String[] args) {
        String text = "first second third fourth";
        String[] pieces = text.split(" ");

        System.out.println();
        int i = pieces.length - 1;
        System.out.println(pieces[i]);

    }
}
