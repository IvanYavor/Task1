package com.ua.model;

public class TreatmentTravelPackage extends TravelPackage {
    private String city;
    // make enum
    private String nameOfFacility;

    public TreatmentTravelPackage(int durationInDays, double price, int numberOfMealsInDay, TypeOfTransport typeOfTransport, String city, String nameOfFacility) {
        super(durationInDays, price, numberOfMealsInDay, typeOfTransport);
        setCity(city);
        setNameOfFacility(nameOfFacility);
    }

    public String getCity() {
        return city;
    }

    public String getNameOfFacility() {
        return nameOfFacility;
    }

    public void setCity(String city) {
        if(city == null)  {
            this.city = "unknown";
        } else {
            this.city = city;
        }
    }

    public void setNameOfFacility(String nameOfFacility) {
        if(nameOfFacility == null) {
            this.nameOfFacility = "unknown";
        } else {
            this.nameOfFacility = nameOfFacility;
        }
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() + "City: " + city + "; " + "Name of Facility: " + nameOfFacility + "; ";
    }
}
