package com.classes;

public class Car {
    private String model;
    private double price;
    private boolean isNew;

    // constructors - for default values:
    public Car() {
        model = "Honda";
        price = 2500;
        isNew = false;
    }

    // overloaded or parametrized constructors
    public Car(String newModel, double newPrice, boolean flag) {
        setModel(newModel);
        setPrice(newPrice);
        setNew(flag);
    }

    // we are doing this, to give indirect access to the users.

    // setters - update/set the values of the data numbers
    public void setModel(String newModel) {
        if (newModel != "") {
            model = newModel;
        } else {
            model = "Still in Progress";
        }
    }

    public void setPrice(double newPrice) {
        if (newPrice > 0) {
            price = newPrice;
        } else {
            price = 5000;
        }
    }

    public void setNew(boolean flag) {
        isNew = flag;
    }

    // getters, queries - this is only to show the value of the data numbers

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public boolean getNew() {
        return isNew;
    }

    // support function:
    public void displayCar() {
        System.out.println("Car is " + getModel());
        System.out.println("Price is " + getPrice());
        if (getNew()) {
            System.out.println("Car is New");
        } else {
            System.out.println("Car is used");
        }

    }

}
