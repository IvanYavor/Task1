package com.ua.controller;

import com.ua.model.*;
import com.ua.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.view = view;
        this.model = model;
    }

    public void processUser() {

        List<TravelPackage> cruiseTravelPackageList = makeListOfCruises();
        view.printMessage(View.UNSORTED_ARRAY);
        view.printList(cruiseTravelPackageList);
        Collections.sort(cruiseTravelPackageList, new SortByNumberOfMealsInDay());
        view.printMessage(View.SORTED_BY_MEALS);
        view.printList(cruiseTravelPackageList);


        List<TravelPackage> shoppingPackagesList = makeListOfShoppingPackages();
        view.printMessage(View.UNSORTED_ARRAY);
        view.printList(shoppingPackagesList);
        Collections.sort(shoppingPackagesList, new SortByTypeOfTransport());
        view.printMessage(View.SORTED_BY_TRANSPORT);
        view.printList(shoppingPackagesList);
    }

    public List<TravelPackage> makeListOfCruises() {
        TravelPackage cruiseTravelPackage1 = new CruiseTravelPackage(7, 100.0, 3,  new String[] {"London", "New York"});
        TravelPackage cruiseTravelPackage2 = new CruiseTravelPackage(3, 90.0, 3,  new String[] {"Paris", "New York", "Mexico"});
        TravelPackage cruiseTravelPackage3 = new CruiseTravelPackage(6, 107.0, 5,  new String[] {"Odessa", "Rome"});
        TravelPackage cruiseTravelPackage4 = new CruiseTravelPackage(14, 120.0, 3,  new String[] {"London", "Rome", "Odessa"});
        TravelPackage cruiseTravelPackage5 = new CruiseTravelPackage(3, 500.0, 3,  new String[] {"Istanbul", "Odessa"});
        TravelPackage cruiseTravelPackage6 = new CruiseTravelPackage(6, 1050.0, 5,  new String[] {"Naomi", "Tokyo"});
        TravelPackage cruiseTravelPackage7 = new CruiseTravelPackage(3, 1001.0, 3,  new String[] {"Hawaii", "Peking"});
        TravelPackage cruiseTravelPackage8 = new CruiseTravelPackage(14, 120.0, 5,  new String[] {"London", "Manchester"});

        List<TravelPackage> travelPackageList = new ArrayList<TravelPackage>();
        travelPackageList.add(cruiseTravelPackage1);
        travelPackageList.add(cruiseTravelPackage2);
        travelPackageList.add(cruiseTravelPackage3);
        travelPackageList.add(cruiseTravelPackage4);
        travelPackageList.add(cruiseTravelPackage5);
        travelPackageList.add(cruiseTravelPackage6);
        travelPackageList.add(cruiseTravelPackage7);
        travelPackageList.add(cruiseTravelPackage8);

        return travelPackageList;
    }

    public List<TravelPackage> makeListOfShoppingPackages() {
        TravelPackage shoppingTravelPackage1 = new ShoppingTravelPackage(7, 100.0, 3, TypeOfTransport.UNKNOWN, "London", "Zaaz");
        TravelPackage shoppingTravelPackage2 = new ShoppingTravelPackage(7, 900.0, 5, TypeOfTransport.CAR, "Paris", "Z");
        TravelPackage shoppingTravelPackage3 = new ShoppingTravelPackage(7, 800.0, 5, TypeOfTransport.TRAIN, "Milan", "Bo");
        TravelPackage shoppingTravelPackage4 = new ShoppingTravelPackage(7, 700.0, 3, TypeOfTransport.PLANE, "Kiev", "Ar");
        TravelPackage shoppingTravelPackage5 = new ShoppingTravelPackage(7, 600.0, 3, TypeOfTransport.CAR, "London", "Xy");
        TravelPackage shoppingTravelPackage6 = new ShoppingTravelPackage(7, 400.0, 5, TypeOfTransport.TRAIN, "Milan", "Ol");

        List<TravelPackage> shoppingTravelPackagesList = new ArrayList<TravelPackage>();

        shoppingTravelPackagesList.add(shoppingTravelPackage1);
        shoppingTravelPackagesList.add(shoppingTravelPackage2);
        shoppingTravelPackagesList.add(shoppingTravelPackage3);
        shoppingTravelPackagesList.add(shoppingTravelPackage4);
        shoppingTravelPackagesList.add(shoppingTravelPackage5);
        shoppingTravelPackagesList.add(shoppingTravelPackage6);

        return shoppingTravelPackagesList;

    }
}
