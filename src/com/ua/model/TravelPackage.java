package com.ua.model;

import java.lang.reflect.Type;
import java.util.Comparator;
import com.ua.model.TypeOfTransport;

public class TravelPackage implements Comparable<TravelPackage>{
    private double price;
    private int durationInDays;
    private int numberOfMealsInDay;
    // make it enum
    private TypeOfTransport typeOfTransport;

    // Constructors
    public TravelPackage() {
        this.price = 100.0;
        this.durationInDays = 0;
        this.numberOfMealsInDay = 0;
        this.typeOfTransport = TypeOfTransport.UNKNOWN;
    }

    public TravelPackage(int durationInDays, double price, int numberOfMealsInDay, TypeOfTransport typeOfTransport) {
        setPrice(price);
        setDurationInDays(durationInDays);
        setNumberOfMealsInDay(numberOfMealsInDay);
        setTypeOfTransport(typeOfTransport);
    }

    public TravelPackage(int durationInDays, double price, int numberOfMealsInDay) {
        setDurationInDays(durationInDays);
        setPrice(price);
        setNumberOfMealsInDay(numberOfMealsInDay);
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

    public TypeOfTransport getTypeOfTransport() {
        return typeOfTransport;
    }

    // Setters
    public void setPrice(double price) {
        if(price < 0.0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public void setDurationInDays(int durationInDays) {
        if(durationInDays < 0) {
            this.durationInDays = 0;
        } else {
            this.durationInDays = durationInDays;
        }
    }

    public void setNumberOfMealsInDay(int numberOfMealsInDay) {
        if(numberOfMealsInDay < 0) {
            this.numberOfMealsInDay = 0;
        } else {
            this.numberOfMealsInDay = numberOfMealsInDay;
        }
    }

    public void setTypeOfTransport(TypeOfTransport typeOfTransport) {
        if(typeOfTransport == null) {
            this.typeOfTransport = TypeOfTransport.UNKNOWN;
        } else {
            this.typeOfTransport = typeOfTransport;
        }
    }

    // comparision methods

//    @Override
//    public int compareTo(TravelPackage travelPackage) {
//        return (int) (this.getPrice() - travelPackage.getPrice());
//    }

    @Override
    public int compareTo(TravelPackage travelPackage) {
        if(this.getPrice() < travelPackage.getPrice()) return -1;
        if(this.getPrice() > travelPackage.getPrice()) return 1;
        return 0;
    }

//    public static Comparator<TravelPackage> TravelPackagePriceComparator =
//                                new Comparator<TravelPackage>() {
//                                    @Override
//                                    public int compare(TravelPackage travelPackage1, TravelPackage travelPackage2) {
//                                        if(travelPackage1.getPrice() < travelPackage2.getPrice()) return -1;
//                                        if(travelPackage1.getPrice() > travelPackage2.getPrice()) return 1;
//                                        return 0;
//                                    }
//                                };

    //toString()
    public String toString() {
        return "Price " + price + "$; " + "Duration: " + durationInDays + " days; " + "Meal: " + numberOfMealsInDay + " times; " + "Transport: " + typeOfTransport + "; ";
    }

}
