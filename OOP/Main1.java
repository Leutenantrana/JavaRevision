
package OOP;

import java.util.Scanner;
import java.nio.file.Paths;

public class Main1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("file.txt"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (row.isEmpty()) {
                    continue;
                }
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

}
