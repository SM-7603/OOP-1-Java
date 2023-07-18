/* 
 * # Program Name: Assignment_03_Classes_and_Functions.java
 * # Program Author: Shubham Mohanty
 * # Program Date: July 13th, 2023
 * # Program Description: 
 *  - It's a program that allows the users to do 
 */

//  also, the 3rd error message doesn't work... I tried to catch the error, where it showed the prompt that maximum size has been exceeded. (But apparently the illegal arguments exception catches it)

import java.util.InputMismatchException;
import java.util.Scanner;

public class ICE3_test {

    public static void main(String[] args) {
        // this is for the try except, if - else?
        boolean done = false;
        // this is the number, that we'll be using to store the values
        int num = 0;

        // storing the sum
        int num_sum = 0;

        // using scanner to take the input
        Scanner input = new Scanner(System.in);

        String message = "How many values do you want to enter: ";

        int numValues = 0;

        // validation - 01 (for the num of values)
        while (!done) {
            try {
                System.out.println(message);
                numValues = Integer.parseInt(input.nextLine());
                if (numValues < 0) {
                    throw new IllegalArgumentException();
                }
                done = true;
            } catch (NumberFormatException nfe) {
                // TODO: handle exception
                System.out.println("Error: " + nfe + " Only Numeric Values are accepted");
            } catch (IllegalArgumentException iae) { // iae = illegal argument error
                System.out.println("Error: " + iae + " " + num + " Only +ve Values are accepted");
            }
        }

        done = false;

        // now we create the loop:
        for (int i = 0; i < numValues + 1; i++) {
            try {
                System.out.println("Enter value #" + i + ": ");
                num = Integer.parseInt(input.nextLine());
                if (num < 0) {
                    throw new IllegalArgumentException();
                }
                // This is the main calculation:
                num_sum += num;
            } catch (NumberFormatException nfe) {
                // TODO: handle exception
                System.out.println("Error: " + nfe + " Only Numeric Values are accepted");
            } catch (IllegalArgumentException iae) { // iae = illegal argument error
                System.out.println("Error: " + iae + " " + num + " Only +ve Values are accepted");
            } catch (InputMismatchException ime) {
                System.out.println("Error: " + ime + "Entered value is too large for an integer");
            }
        }

    }
}