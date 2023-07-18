/* 
 * # Program Name: Assignment_03_Classes_and_Functions.java
 * # Program Author: Shubham Mohanty
 * # Program Date: July 7th, 2023
 * # Program Description: 
 *  - It's a program that allows the users to create new vaccines, define their attributes like id, name, cost, quantity, expiryDate & whether they want the output for the vaccine to be shown in a table or not/
 * # Concepts utilized: 
 *      - Using basic OOP concepts, by creating new instances/objects for the Vaccine Class, defining their attributes, using getters & setters, etc.
 *      - Looping though an array
 *      - output formatting using "printf" 
 *      - compound conditional statements
 *      - using access modifiers (public / private)
 *      - using the `static` keyword to create static variables
 *      - using the constructor & overloaded constructor to define the attribute values
 *      - using support functions to make life easier by cleaning up the code
 */

public class Assignment_03_Classes_and_Functions {
    public static void main(String[] args) {

        // creating the object "emptyVaccine" and not defining its attributes, so that
        // it uses the default constructor
        Vaccine emptyVaccine = new Vaccine();
        emptyVaccine.displayVaccine();

        // Setting values using setters
        emptyVaccine.setId(7);
        emptyVaccine.setName("Shubham's Vaccine");
        emptyVaccine.setCost(200.0);
        emptyVaccine.setQuantity(100);
        emptyVaccine.setExpiryDate("2028-12-12");

        // For a line break
        System.out.println();

        // // checking if my getters work or not (they do 😁)
        // System.out.println("Empty Vaccine ID: " + emptyVaccine.getId());
        // System.out.println("Empty Vaccine Name: " + emptyVaccine.getName());
        // System.out.println("Empty Vaccine Cost: " + emptyVaccine.getCost());
        // System.out.println("Empty Vaccine Quantity: " + emptyVaccine.getQuantity());
        // System.out.println("Empty Vaccine Expiry Date: " + emptyVaccine.getExpiryDate());

        emptyVaccine.displayVaccine();

        // Instantiate the "Vaccine" class to create new vaccines (objects)
        Vaccine vaccine1 = new Vaccine(1, "Pfizer", 20.0, 100, "2024-8-28", true);
        Vaccine vaccine2 = new Vaccine(2, "CovidShield", 25.0, 275, "2024-3-18", true);
        Vaccine vaccine3 = new Vaccine(3, "Covaxin", 35.0, 200, "2024-7-25", true);
        Vaccine vaccine4 = new Vaccine(4, "Moderna", 45.0, 100, "2024-5-12", true);
        Vaccine vaccine5 = new Vaccine(5, "Janssen", 55.0, 70, "2024-2-14", true);

        // create an array of the dataType `Vaccine` (our class)
        Vaccine[] vaccines = { vaccine1, vaccine2, vaccine3, vaccine4, vaccine5 };

        // just trying something out:
        // String[] arr1 = {"1", "2", "3"};
        // for (int i = 0; i < arr1.length; i++) {
        // System.out.println(arr1[i]);
        // }

        // creating a variable, to store the "length" - num of items of the array, so
        // that I could use it in a for loop...
        int arrayLength = vaccines.length;

        // using a `for` loop to iterate over the array, & apply the displayVaccine()
        // method to each of the elements (which are objects in this case) to show the
        // message
        for (int i = 0; i <= arrayLength; i++) {
            // the if statement is just used to create an extra line at the end in the
            // terminal/console to make the output look a little better
            if (i < arrayLength) {
                vaccines[i].displayVaccine();
            } else {
                // just to add an extra line in the end, I tried to do this in the display
                // function, but since it wasn't really stated in the requirements I just did it
                // here...
                System.out.println();
            }
        }
    }
}
