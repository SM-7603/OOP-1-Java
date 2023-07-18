/* 
 * Program Name: Assignment_01_projectile_motion.java
 * Program Author: Shubham Mohanty
 * Program Date: May 26th, 2023
 * Program Description: 
 *  - The program is a simple calculator, that calculates the horizontal range of a projectile after prompting and receiving inputs (initial velocity & initial angle of projection). 
 *  - It does so by using the formula: (v^2 * sin(2*theta)/g). The program uses the math module for absolute values & trigonometric calculations & the scanner for taking inputs from the users. 
 *  - It also uses the DecimalFormat to format the horizontal range till 3 decimal places.
*/

// importing the decimal format class and the scanner class:
import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment_01_projectile_motion {

    public static void main(String[] args) {

        // assigning default values (0) & storing the value of 'g' in a constant
        double initialAngleOfProjection = 0;
        double initialVelocity = 0;
        final double GRAVITATIONAL_CONSTANT_EARTH = 9.8;
        double horizontalRange = 0;

        try (// using scanner to take the user's input
        Scanner myInput = new Scanner(System.in)) {
            // asking for the user inputs:
            System.out.println("Please enter the initial projection angle (in degrees): ");

            initialAngleOfProjection = myInput.nextDouble();

            System.out.println("Please enter the projectile's initial velocity (m/s) : ");

            initialVelocity = myInput.nextDouble();
        }

        

        // changing the entered values to absolute values:

        initialAngleOfProjection = Math.abs(initialAngleOfProjection);

        initialVelocity = Math.abs(initialVelocity);

        // converting the entered value from degrees to radians for calculation:

        double initialAngleOfProjectionRadian = Math.toRadians(initialAngleOfProjection);

        double initialAngleOfProjectionRadianTimesTwo = initialAngleOfProjectionRadian * 2;

        // using the sin() method for the final calculation:

        horizontalRange = Math.pow(initialVelocity, 2) * Math.sin(initialAngleOfProjectionRadianTimesTwo)
                / GRAVITATIONAL_CONSTANT_EARTH;

        // formatting the range to display up till 3 decimal places.
        DecimalFormat formattedDecimal = new DecimalFormat("#.###");

        // Making sure that the horizontal range is positive (I got the distance to be
        // -0 m, when I entered PI (180 deg) and 2PI (360 deg)), thus I'm using abs() on
        // the horizontal range:
        double horizontalRangeAbsoluteValue = Math.abs(horizontalRange);

        // storing the formatted value in a variable (String): (using String, as the
        // output is a string.)

        String formattedHorizontalRange = formattedDecimal.format(horizontalRangeAbsoluteValue);

        // printing out the result message:

        System.out.println("The horizontal range for a projectile thrown at an angle of " + initialAngleOfProjection
                + " degrees with the initial velocity of " + initialVelocity + " will land at a distance of "
                + formattedHorizontalRange
                + " m from the point of projection in the x axis.");

    }

}

/*
 * References:
 * - https://www.geeksforgeeks.org/java-math-sin-method-examples/
 * - https://www.geeksforgeeks.org/java-math-abs-method-examples/
 * https://www.geeksforgeeks.org/how-to-set-precision-for-double-values-in-java/
 * - https://www.geeksforgeeks.org/how-to-take-input-from-user-in-java/ (I
 * already knew how we did it, but I wanted to see if there a simpler method,
 * turns out scanner is the simpler method. 😅)
 */