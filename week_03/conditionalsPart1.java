import java.util.Scanner;

public class conditionalsPart1 {
    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);
        double myDouble = 10;
        int myInt = 9;
        int y = 0;

        // Compound conditions:

        /*
         * and -> we use &&
         * or -> we use ||
         */

        /*
         * if (myDouble % 2 == 0 | myDouble < 9) {
         * System.out.println("Great");
         * } else {
         * System.out.println("Not great!");
         * }
         */

        // Using the shorthand to add stuff:
        /*
         * myDouble += 15; // myDouble = myDouble + 15;
         * System.out.println(myDouble);
         */

        // Incrementing Stuff:
        // y = myInt++; // post increment
        // Interesting thing to note: (my doubt :0),
        /*
         * - when we use the increment eg -> myInt++ is stored inside a variable (y).
         * But when we do so, the value of myInt also changes, along with storing the
         * stuff inside the variable. Whereas when we use a regular operation like y =
         * myInt +1, the value of myInt still stays the exact same.
         *
         */
        // y = myInt + 1;
        // // y = ++myInt; // pre increment

        // System.out.println("Y is " + y + " and int is " + myInt);

        // Most IMP thing for using the switch is using the breaks.
        switch (myInt) {
            case 5:
                System.out.println("The value is 5");
                break;
            case 9:
                System.out.println("It is 9");
                break;
            case 12:
                System.out.println("It is a 12");
                break;
            default:
                System.out.println("Enter a valid value");
                break;
        }

    }
}
