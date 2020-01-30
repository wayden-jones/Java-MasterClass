package com.company;

import java.util.SplittableRandom;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public String  getModel(){
        return this.model;
    }

    public String  getEngine(){
        return this.engine;
    }

    public String  getColour(){
        return this.colour;
    }

    public int getDoors(){
        return this.doors;
    }
    public int getWheels(){
        return this.wheels;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setEngine(String engine){
        this.engine = engine;
    }

    public void setColour(String colour){
       this.colour = colour;
    }


    Car(int doors, int wheels, String model, String engine, String colour){
        this.doors =doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }

}
