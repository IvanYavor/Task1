package com.ua.model;


public class ShoppingTravelPackage extends TravelPackage {
    private String city;
    private String brand;

    public ShoppingTravelPackage(int durationInDays, double price, int numberOfMealsInDay, TypeOfTransport typeOfTransport, String city, String brand) {
        super(durationInDays, price, numberOfMealsInDay, typeOfTransport);
        this.city = city;
        this.brand = brand;
    }

    public void setCity(String city) {
        if(city == null) {
            this.city = "unknown";
        } else {
            this.city = city;
        }
    }

    public void setBrand(String brand) {
        if(brand == null) {
            this.brand = "unknown";
        } else {
            this.brand = brand;
        }
    }

    public String getCity() {
        return city;
    }

    public String getBrand() {
        return brand;
    }


    @Override
    public String toString() {
        return super.toString() + " City: " + city + "; " + "Brand: " + brand + "; ";
    }
}
