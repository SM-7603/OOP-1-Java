import java.util.Scanner;

/*
 * ErrorHandling
 */
public class ErrorHandling {

    public static void main(String[] args) {

        boolean done = false;
        int num = 0;
        Scanner input = new Scanner(System.in);

        while (!done) {
            System.out.println("Please enter a +ve number: ");
            try {
                num = Integer.parseInt(input.nextLine());
                if (num < 0) {
                    throw new IllegalArgumentException();
                }
                done = true;
                // nfe - Number Format Exception -> just a variable
            } catch (NumberFormatException nfe) {
                // TODO: handle exception
                System.out.println("Error: " + nfe + " Only Numeric Values are accepted");
            } catch (IllegalArgumentException iae) { // iae = illegal argument error
                System.out.println("Error: " + iae + " " + num + " Only +ve Values are accepted");
            }
        }
        System.out.println("Done B-D");
    }

}