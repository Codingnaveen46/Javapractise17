package assignmentOnMethods;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGrades studentGrades = new StudentGrades();

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add New Student Grade");
            System.out.println("2. Remove Grade");
            System.out.println("3. View Grades");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.next();
                    System.out.print("Enter assignment name: ");
                    String assignmentName = scanner.next();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    studentGrades.addNewStudentGrade(studentName, assignmentName, grade);
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    studentName = scanner.next();
                    System.out.print("Enter assignment name: ");
                    assignmentName = scanner.next();
                    studentGrades.removeGrade(studentName, assignmentName);
                    break;
                case 3:
                    studentGrades.viewGrades();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        scanner.close();
    }
}