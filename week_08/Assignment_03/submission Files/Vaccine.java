public class Vaccine {
    // declaring a static variable - these belong to the class itself (not any
    // particular instance, meaning all the instances share the same "copy" of the
    // variable, meaning if we alter it somewhere, its altered everywhere)

    // I'm using this to make the output look a little more aesthetic
    private static boolean messageTableDisplayed = false;
    private static boolean messageNonLinearDisplayed = false;

    // declaring the private instance variables - (so that they can't be modified
    // outside the class - "encapsulation")
    private int id;
    private String name;
    private double cost;
    private int quantity;
    private String expiryDate;
    private boolean isTableFormat;

    // Default constructor
    public Vaccine() {
        id = 0;
        name = "Default Vaccine";
        cost = 150.0;
        quantity = 150;
        expiryDate = "2025-12-18";
        isTableFormat = false;
    }

    // Parameterized constructor - (I ended up using the `this` keyword as I didn't
    // want to change the variable names, and this is similar to the python `self`)
    public Vaccine(int id, String name, double cost, int quantity, String expiryDate, boolean isTableFormat) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.isTableFormat = isTableFormat;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setIsTableFormat(boolean isTableFormat) {
        this.isTableFormat = isTableFormat;
    }

    public boolean getIsTableFormat() {
        return isTableFormat;
    }

    // Display function - this right here is the support function
    public void displayVaccine() {
        if (isTableFormat) {
            if (!messageTableDisplayed) {
                System.out.println("\nHere's the data in a tabular form:\n");
                // the digits after the `%` denote the `space` that I want for each of the
                // dataTypes to have in the terminal, it took some trial and error to correctly
                // get the desired output
                System.out.printf("%5s | %13s | %9s | %3s | %10s\n", "SKU", "Vaccine Name", "Unit Cost", "QTY",
                        "Expiry");
                // System.out.println("------|---------------|-----------|-----|------------");

                messageTableDisplayed = true;
            }
            // System.out.printf("%5s | %13s | %9s | %3s | %10s\n", "SKU", "Vaccine Name",
            // "Unit Cost", "QTY", "Expiry");
            System.out.println("------|---------------|-----------|-----|------------");
        } else {
            if (!messageNonLinearDisplayed) {
                System.out.println("\nHere's the data in a non-linear form:\n");
                messageNonLinearDisplayed = true;
            }
            // I was trying to put the whole thing in a single if else block, but this
            // created duplicates
            // System.out.println("Here's the data in a non-linear form:\n");
            // System.out.println("SKU:");
            // System.out.println("Vaccine Name:");
            // System.out.println("Unit Cost:");
            // System.out.println("Quantity on hand:");
            // System.out.println("Expiry Date:");
        }

        // printing out the actual values:

        if (isTableFormat) {
            // This created duplicate messages:
            // System.out.println("Here's the data in a tabular form:\n");
            System.out.printf("%5d | %13s | %9f | %3d | %10s\n", id, name, cost, quantity, expiryDate);
        } else {
            // This created duplicate messages:
            // System.out.println("Here's the data in a non-linear form:\n");
            System.out.println("SKU: " + id);
            System.out.println("Vaccine Name: " + name);
            System.out.println("Unit Cost: " + cost);
            System.out.println("Quantity on hand: " + quantity);
            System.out.println("Expiry Date: " + expiryDate);
        }

        // if (isTableFormat) {
        // System.out.println("-----------------------------------------------------");
        // }
    }

}

/*
 * # References:
 * - https://www.geeksforgeeks.org/formatted-output-in-java/
 * - https://www.geeksforgeeks.org/this-reference-in-java/
 * - https://www.geeksforgeeks.org/encapsulation-in-java/
 * - https://www.geeksforgeeks.org/encapsulation-in-java/
 * - https://www.geeksforgeeks.org/static-keyword-java/
 * - https://www.geeksforgeeks.org/getter-and-setter-in-java/
 * - https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/
 */