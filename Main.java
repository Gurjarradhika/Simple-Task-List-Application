import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nTask List Application");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskList.addTask(new Task(description));
                    System.out.println("Task added.");
                    break;
                case 2:
                    System.out.println("Task List:");
                    taskList.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter task number to remove: ");
                    int index = scanner.nextInt();
                    taskList.removeTask(index - 1);
                    System.out.println("Task removed.");
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
