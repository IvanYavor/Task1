package com.ua;

import com.ua.controller.Controller;
import com.ua.model.Model;
import com.ua.view.View;


public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());

        controller.processUser();
    }
}
