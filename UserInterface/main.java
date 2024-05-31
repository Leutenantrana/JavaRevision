package UserInterface;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordSet set = new WordSet();

        UserInterrface userInterface = new UserInterrface(set, scanner);
        userInterface.start();
    }
}
