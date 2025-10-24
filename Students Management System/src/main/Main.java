package main;
import data.Dao;
import java.util.*;
import model.Student;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dao data = new Dao();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the ID of the Student: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter the Name of the Student: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the Age of the Student: ");
                    int age = sc.nextInt();
                    data.addStudent(new Student(id, name, age));
                    break;

                case 2:
                    System.out.print("Enter the ID of the Student to remove: ");
                    int idToRemove = sc.nextInt();
                    data.removeStudent(idToRemove);
                    break;

                case 3:
                    data.viewStudent();
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
