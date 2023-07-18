package com.classes;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.setModel("BMW520");
        myCar.setPrice(40_000);
        myCar.setNew(true);

        myCar.displayCar();

        System.out.println("################");

        Car myFriendCar = new Car("Tesla", 50_000, true);

        myFriendCar.displayCar();

    }

}