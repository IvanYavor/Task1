package com.ua.model;

public class CruiseTravelPackage extends TravelPackage {
    private String[] stops;

    public CruiseTravelPackage(int durationInDays, double price, int numberOfMealsInDay, String[] stops) {
        super(durationInDays, price, numberOfMealsInDay);
        setStops(stops);
        setTypeOfTransport(TypeOfTransport.FERRY);
    }

    public void setStops(String[] stops) {
        if(stops == null) {
            this.stops = new String[0];
        } else {
            this.stops = stops;
        }
    }

    public String[] getStops() {
        return stops;
    }

    //toString()
    @Override
    public String toString() {
        String str = super.toString() + " Stops: ";
        for(String stop: stops) {
            str += stop + " ";
        }
        str += "; ";
        return str;
    }
}
