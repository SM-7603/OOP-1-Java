/* 
 * Program Name: Assignment_02_TemperatureAnalysisSystem.java
 * Program Author: Shubham Mohanty
 * Program Date: June 9th, 2023
 * Program Description: 
 *  - It's a program that allows the users to input the daily temperature and get the average temp. for the day and then for the entire time-period.
 * - It also displays the days with the highest and the lowest temperatures.
 * - The program also has inbuilt checks/validations to ensure that the days ensured are within the range of [1, 31] & that the lowest temp > highest temp.
 * - Concepts utilized: 
 *      - Arrays
 *      - loops
 *      - output formatting using "printf" 
 *      - compound conditional statements
 */

import java.util.Scanner;

public class Assignment_02_TemperatureAnalysisSystem {

    public static void main(String[] args) {

        System.out.println("Welcome to the Temperature Analysis System!!!");

        // using scanner to take the user's input
        Scanner myInput = new Scanner(System.in);

        // Get the number of days from the user
        System.out.print("Enter the number of days (b/w 1 and 31): ");
        int numDays = myInput.nextInt();

        // Validate the number of days
        while (numDays < 1 || numDays > 31) {
            System.out.println("Invalid number of days. \nPlease enter a value b/w 1 and 31:");
            numDays = myInput.nextInt();
        }

        // Create arrays to store the temperatures
        double[] lowTemperatures = new double[numDays];
        double[] highTemperatures = new double[numDays];

        // Get the temperatures for each day
        for (int i = 0; i < numDays; i++) {
            System.out.println("\nDay " + (i + 1));

            // Get the low temperature
            System.out.print("Enter the low temperature: ");
            double lowTemp = myInput.nextDouble();

            // Validate the low temperature
            while (lowTemp < -30 || lowTemp > 30) {
                System.out.println("Invalid low temperature. Please enter a value between -30 and 30.");
                lowTemp = myInput.nextDouble();
            }

            // Get the high temperature
            System.out.print("Enter the high temperature: ");
            double highTemp = myInput.nextDouble();

            // Validate the high temperature
            while (highTemp < -30 || highTemp > 30 || highTemp < lowTemp) {
                System.out.println(
                        "Invalid high temperature. Please enter a value between -30 and 30, higher than the low temperature.");
                highTemp = myInput.nextDouble();
            }

            // Store the temperatures in the arrays
            lowTemperatures[i] = lowTemp;
            highTemperatures[i] = highTemp;

            // Calculate and display the average temperature for the day
            double averageTemp = (lowTemp + highTemp) / 2;
            System.out.printf("Average temperature for day %d: %.1f\n", (i + 1), averageTemp);
        }

        // Calculate the overall average temperature
        double sumTemperatures = 0;
        for (int i = 0; i < numDays; i++) {
            sumTemperatures += (lowTemperatures[i] + highTemperatures[i]);
        }
        double overallAverage = sumTemperatures / (2 * numDays);

        // Find the day with the lowest temperature
        int lowestDay = 0;
        double lowestTemperature = lowTemperatures[0];
        for (int i = 1; i < numDays; i++) {
            if (lowTemperatures[i] < lowestTemperature) {
                lowestDay = i;
                lowestTemperature = lowTemperatures[i];
            }
        }

        // Find the day with the highest temperature
        int highestDay = 0;
        double highestTemperature = highTemperatures[0];
        for (int i = 1; i < numDays; i++) {
            if (highTemperatures[i] > highestTemperature) {
                highestDay = i;
                highestTemperature = highTemperatures[i];
            }
        }

        // Display the overall average, lowest temperature day, and highest temperature
        // day
        System.out.println("\n===================================");
        System.out.printf("Overall average temperature: %.1f\n", overallAverage);
        System.out.printf("Day with lowest temperature: %d\n", (lowestDay + 1));
        System.out.printf("Day with highest temperature: %d\n", (highestDay + 1));
        System.out.println("===================================");

        myInput.close();

    }

}