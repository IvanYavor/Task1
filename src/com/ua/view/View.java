package com.ua.view;

import com.ua.model.TravelPackage;

import java.util.List;

public class View {
    public static final String SORTED_BY_PRICE = "Array sorted by price.";
    public static final String SORTED_BY_MEALS = "Array sorted by number of meals.";
    public static final String SORTED_BY_TRANSPORT = "Array sorted by type of transport.";
    public static final String SORTED_BY_DURATION = "Array sorted by duration in days.";
    public static final String UNSORTED_ARRAY = "Unsorted array.";


    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printList(List<TravelPackage> list) {
        for(TravelPackage item : list) {
            System.out.println(item);
        }
        //System.out.println(list);
    }
}
