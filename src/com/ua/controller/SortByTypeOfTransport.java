package com.ua.controller;

import java.util.Comparator;
import com.ua.model.TravelPackage;

public class SortByTypeOfTransport implements Comparator<TravelPackage> {
    @Override
    public int compare(TravelPackage travelPackage1, TravelPackage travelPackage2) {
        //return travelPackage1.getTypeOfTransport() - travelPackage2.getTypeOfTransport();
        return travelPackage1.getTypeOfTransport().compareTo(travelPackage2.getTypeOfTransport());
    }
}
