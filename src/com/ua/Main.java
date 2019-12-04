package com.ua;

import com.ua.controller.*;
import com.ua.model.*;
import com.ua.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());

        controller.processUser();
    }
}
