import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    public static void main(String[] args) {
      
        ArrayList<String> students = new ArrayList<>();

        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Show menu
            System.out.println("\n===== Student List Menu =====");
            System.out.println("1. Add a student");
            System.out.println("2. Display all students");
            System.out.println("3. Remove a student");
            System.out.println("4. Search for a student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline left by nextInt()

            switch (choice) {
                case 1:
                    // Add student
                    System.out.print("Enter student name to add: ");
                    String nameToAdd = scanner.nextLine();
                    students.add(nameToAdd);
                    System.out.println(nameToAdd + " has been added.");
                    break;

                case 2:
                    // Display all students
                    System.out.println("\n--- Student List ---");
                    if (students.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        for (String name : students) {
                            System.out.println("- " + name);
                        }
                    }
                    break;

                case 3:
                    // Remove a student
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    if (students.remove(nameToRemove)) {
                        System.out.println(nameToRemove + " has been removed.");
                    } else {
                        System.out.println(nameToRemove + " was not found.");
                    }
                    break;

                case 4:
                    // Search for a student
                    System.out.print("Enter student name to search: ");
                    String nameToSearch = scanner.nextLine();
                    if (students.contains(nameToSearch)) {
                        System.out.println(nameToSearch + " is in the list.");
                    } else {
                        System.out.println(nameToSearch + " is not in the list.");
                    }
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }
}
