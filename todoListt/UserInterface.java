package todoListt;

import java.util.Scanner;

public class UserInterface {
    private todoList schedule;
    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.schedule = new todoList();

    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("Stop")) {
                break;

            }
            if (command.equals("add")) {
                System.out.println("To add: ");
                String taskToAdd = scanner.nextLine();
                this.schedule.add(taskToAdd);
            }
            if (command.equals("remove")) {
                System.out.println("Which one to remove: ");
                int position = Integer.valueOf(scanner.nextLine());
                this.schedule.remove(position);
            }
        }

        this.schedule.print();
    }

}
