import java.util.ArrayList;
import java.util.Scanner;

public class LinkedList {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
          
            System.out.println("\n--- Student List Menu ---");
            System.out.println("1. Add student");
            System.out.println("2. Display all students");
            System.out.println("3. Remove a student");
            System.out.println("4. Search for a student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
           
                    System.out.print("Enter student name to add: ");
                    String nameToAdd = scanner.nextLine();
                    students.add(nameToAdd);
                    System.out.println(nameToAdd + " added to the list.");
                    break;

                case 2:
                  
                    System.out.println("\nList of students:");
                    if (students.isEmpty()) {
                        System.out.println("No students in the list.");
                    } else {
                        for (String student : students) {
                            System.out.println("- " + student);
                        }
                    }
                    break;

                case 3:
                
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    if (students.remove(nameToRemove)) {
                        System.out.println(nameToRemove + " removed from the list.");
                    } else {
                        System.out.println(nameToRemove + " not found in the list.");
                    }
                    break;

                case 4:
                   
                    System.out.print("Enter student name to search: ");
                    String nameToSearch = scanner.nextLine();
                    if (students.contains(nameToSearch)) {
                        System.out.println(nameToSearch + " is in the list.");
                    } else {
                        System.out.println(nameToSearch + " not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
