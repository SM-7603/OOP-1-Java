/* 
 * Program Name: ICE2.java
 * Program Author: Shubham Mohanty
 * Program Date: June 16th, 2023
 * Program Description: This program demonstrates the use of functions, this program in particular contains 3 functions 'drawStars', 'printStatement', and the overloaded versions of 'multiplyNumbers'.
*/

// 4 functions are needed to be created...

public class ICE2 {
    // 1st function
    public static void drawStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
    // 2nd function
    public static void printStatement(String message) {
        System.out.println(message);
    }
    // 3rd function
    public static int multiplyNumbers(int a, int b) {
        int value = a * b;
        return value;
    }
    // 4th function (overloaded version of the 3rd one)
    public static double multiplyNumbers(double a, double b) {
        double value = a * b;
        return value;
    }

    public static void main(String[] args) {
        // Calling the 1st function:
        drawStars(15);

        // print a new line:
        System.out.println("");

        // Calling the 2nd function:
        printStatement("ICE2: Function Practice Start");

        // Calling the (multiplyNumbers) 3rd function (with the return type of int)
        int productInteger = multiplyNumbers(3, 5);

        // Printing the result of the 3rd function:
        System.out.println("The value of 3 x 5 = " + productInteger);

        // Calling the (multiplyNumbers) 4rd function (with the return type of double)
        double productDecimal = multiplyNumbers(3.141, 2.718);

        // Printing out the result of the 4th function:
        System.out.println("The value of 3.141 x 2.718 = " + productDecimal);

        // Calling the printStatement function again:
        printStatement("ICE2: Function Practice End");

        // Calling the drawStars to mark the end of the program:
        drawStars(15);

    }
}
