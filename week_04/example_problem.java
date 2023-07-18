
/*
 * example_problem
 */
import java.util.Scanner;

public class example_problem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double grade;
        double sum = 0;
        double average = 0;
        int numStudentsInClass = 0;

        System.out.println("Enter the number of students in the class: ");
        numStudentsInClass = input.nextInt();

        for (int i = 0; i < numStudentsInClass; i++) {
            System.out.println("Please enter a grade b/w 0 and 100 for student-" + (i + 1) + " :");
            grade = input.nextDouble();

            while (grade < 0 || grade > 100) {
                System.out.println("Error!!!, grades can only be b/w 0 & 100, try again: ");
                grade = input.nextDouble();
            }
            sum += grade;
        }

        average = sum / 5;

        System.out.println("The class average is = " + average);


        /*
         * // using a conditional statement:
         * 
         * if (grade >= 0 || grade <= 100) {
         * System.out.println("You entered: " + grade);
         * } else {
         * System.out.println("Please enter the grade within the range of [0, 100]");
         * }
         */
        // while (true) {
        // System.out.println("Please enter a grade b/w 0 and 100.");
        // grade = input.nextDouble();

        // if (grade >= 0 || grade <= 100) {
        // System.out.println("You entered: " + grade);
        // break;
        // } else {
        // System.out.println("Please enter the grade within the range of [0, 100]");
        // continue;
        // }

        // }

    }

}