package com.ua.model;

public class travelPackage {
    //private String typeOfTravel;
    private double price;
    private int durationInDays;
    private int numberOfMealsInDay;
    // make it enum
    private String typeOfTransport;

    // Constructors
    public travelPackage() {
        this.price = 100.0;
        this.durationInDays = 7;
        this.numberOfMealsInDay = 3;
        this.typeOfTransport = "Bus";
    }

    public travelPackage(int durationInDays, double price, int numberOfMealsInDay, String typeOfTransport) {
        this.price = price;
        this.durationInDays = durationInDays;
        this.numberOfMealsInDay = numberOfMealsInDay;
        this.typeOfTransport = typeOfTransport;
    }

    public travelPackage(int durationInDays, double price, int numberOfMealsInDay) {
        this.durationInDays = durationInDays;
        this.price = price;
        this.numberOfMealsInDay = numberOfMealsInDay;
    }

    public travelPackage(double price, String typeOfTransport) {
        this.price = price;
        this.typeOfTransport = typeOfTransport;
        this.numberOfMealsInDay = 3;
        this.durationInDays = 7;
    }

    public travelPackage(int durationInDays, double price, String typeOfTransport) {
        this.durationInDays = durationInDays;
        this.price = price;
        this.typeOfTransport = typeOfTransport;
        this.numberOfMealsInDay = 3;
    }

    public travelPackage(double price, int numberOfMealsInDay, String typeOfTransport) {
        this.durationInDays = 7;
        this.price = price;
        this.typeOfTransport = typeOfTransport;
        this.numberOfMealsInDay = numberOfMealsInDay;
    }

    // Getters
    public double getPrice() {
        return price;
    }

    public int getDurationInDays() {
        return durationInDays;
    }

    public int getNumberOfMealsInDay() {
        return  numberOfMealsInDay;
    }

    public String getTypeOfTransport() {
        return typeOfTransport;
    }

    // Setters
    public void setPrice(int price) {
        this.price = price;
    }

    public void setDurationInDays(int durationInDays) {
        this.durationInDays = durationInDays;
    }

    public void setNumberOfMealsInDay(int numberOfMealsInDay) {
        this.numberOfMealsInDay = numberOfMealsInDay;
    }

    public void setTypeOfTransport(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

}
