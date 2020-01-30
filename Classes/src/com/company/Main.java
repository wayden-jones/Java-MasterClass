package com.company;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car(2, 4, "911", "3L V6", "red");
        System.out.println(porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());
    }
}
