package com.ua.controller;

import com.ua.model.TravelPackage;
import java.util.Comparator;

public class SortByDurationInDays implements Comparator<TravelPackage> {
    @Override
    public int compare(TravelPackage travelPackage1, TravelPackage travelPackage2) {
        return travelPackage1.getDurationInDays() - travelPackage2.getDurationInDays();
    }
}
