/* 
 * Program Name: ICE1.java
 * Program Author: Shubham Mohanty
 * Program Date: May 15th, 2023
 * Program Description: 
*/

import java.util.Scanner;

public class ICE1 {
    public static void main(String[] args) {

        // Part-01:

        // M.01: Making use of variables, and also add the "\n" inside the strings in
        // the variables.
        String welcomeMessage = "Welcome to my program for ICE1.";
        String nameMessage = "\nName: Shubham Mohanty";
        String bannerIdMessage = "\nID: 100898560";
        System.out.println(welcomeMessage + nameMessage + bannerIdMessage);
        // M.02: Just printing on different lines:
        // System.out.println("Welcome to my program for ICE1.");
        // System.out.println("Name: Shubham Mohanty");
        // System.out.println("ID: 100898560");

        // Part-02: Favorite Quote

        System.out.println(
                "Favorite Quote: \"My dear friend, the entire point of life is to find ways to get others to do your work for you. Don't you know anything about basic economics?\" ~ Breeze, The Final Empire, (Mistborn Book-1, Brandon Sanderson)");

        // Part-03: Taking an input from the user and then using a conditional statement

        Scanner myInput = new Scanner(System.in);
        double myDouble = 0;

        System.out.println("Please enter a decimal value within the range of 50-999 (inclusive): ");

        myDouble = myInput.nextDouble();

        if (myDouble >= 50 && myDouble <= 999) {
            System.out.println("The entered number " + myDouble + " is within the accepted range of [50,999].");
        } else {
            System.out.println("The entered number " + myDouble + " is outside the accepted range of [50,999].");
        }

    }
}
