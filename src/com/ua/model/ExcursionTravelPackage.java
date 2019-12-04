package com.ua.model;

public class ExcursionTravelPackage extends TravelPackage {
    private String[] sights;

    ExcursionTravelPackage(int durationInDays, double price, int numberOfMealsInDay, TypeOfTransport typeOfTransport, String[] sights) {
        super(durationInDays, price, numberOfMealsInDay, typeOfTransport);
        this.sights = sights;
    }

    public void setSights(String[] sights) {
        if(sights == null) {
            this.sights = new String[0];
        } else {
            this.sights = sights;
        }
    }

    //toString()
    @Override
    public String toString() {
        String str = super.toString() + "Sights: ";
        for(String sight: sights) {
            str += sight + " ";
        }
        str += "; ";
        return str;
    }
}
