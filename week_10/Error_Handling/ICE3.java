/* 
 * # Program Name: Assignment_03_Classes_and_Functions.java
 * # Program Author: Shubham Mohanty
 * # Program Date: July 13th, 2023
 * # Program Description: 
 *  - It's a program that allows the users to calculate the average of 'x' number's (x also being an user input), but the purpose of the program is to catch common errors & display an error message, thereby re-prompting the user enter the invalid values/entries.
 */

//  also, I couldn't get the 3rd error message to work... I tried to catch the error, where it should have showed the prompt that the maximum size has been exceeded. (But apparently the illegal arguments exception catches it & I can't display that specific error)

import java.util.Scanner;

public class ICE3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // calling the get num of values function to take use input
        int numValues = getNumValues(input);
        int sum = 0;

        // the main calculation where we call the getValue function to generate the sum, which we then use to calculate the <avg>
        for (int i = 1; i <= numValues; i++) {
            int value = getValue(input, i);
            sum += value;
        }
        // storing the average in a double (as we're diving it)
        double average = (double) sum / numValues;
        System.out.println("The average is: " + average);

        input.close();
    }

    // this is function - 1: to get the num of values that the user wants to enter
    private static int getNumValues(Scanner input) {
        int numValues = 0;
        // condition for the while loop
        boolean done = false;

        while (!done) {
            try {
                System.out.print("How many values do you want to enter: ");
                String userInput = input.nextLine();
                numValues = Integer.parseInt(userInput);
                // condition for the -ve values:
                if (numValues < 0) {
                    throw new IllegalArgumentException("Error: Only positive values are accepted.");
                }
                done = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Error: Only numeric values are accepted.");
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }

        return numValues;
    }

    // this is function - 2: to get the values that the user wants to enter:

    private static int getValue(Scanner input, int index) {
        int value = 0;
        boolean done = false;

        while (!done) {
            try {
                System.out.print("Enter value #" + index + ": ");
                String userInput = input.nextLine();
                value = Integer.parseInt(userInput);
                if (value < 0) {
                    throw new IllegalArgumentException("Error: Only positive values are accepted.");
                }
                done = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Error: Only numeric values are accepted.");
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }

        return value;
    }
}
