import java.util.Scanner;

public class revision {
    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);
        double myDouble = 9.1;
        int myInt = 0;

        System.out.println("Please enter a number: ");
        myInt = myInput.nextInt();

        if (myInt % 2 == 0) {
            System.out.println("The number " + myInt + " is an even number.");
        } else {
            System.out.println("The number " + myInt + " is an add number.");
        }

    }
}