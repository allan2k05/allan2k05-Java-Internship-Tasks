
import java.util.Scanner;

public class StudentMarksCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int mark3 = sc.nextInt();

        if (mark1 < 0 || mark1 > 100 ||
            mark2 < 0 || mark2 > 100 ||
            mark3 < 0 || mark3 > 100) {
            System.out.println("Invalid marks! Enter marks between 0 and 100.");
        } else {
            int total = mark1 + mark2 + mark3;
            double average = total / 3.0;

            System.out.println("\n--- Student Result ---");
            System.out.println("Name: " + name);
            System.out.println("Total Marks: " + total);
            System.out.println("Average: " + average);

            if (mark1 >= 35 && mark2 >= 35 && mark3 >= 35) {
                System.out.println("Result: PASS");
            } else {
                System.out.println("Result: FAIL");
            }
        }

        sc.close();
    }
}
