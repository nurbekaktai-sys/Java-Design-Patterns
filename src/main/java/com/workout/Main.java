package com.assignment2;

import com.assignment2.factorymethod.ShipFactory;
import com.assignment2.factorymethod.TransportFactory;
import com.assignment2.factorymethod.TruckFactory;
import com.assignment2.abstractfactory.Application;
import com.assignment2.abstractfactory.GUIFactory;
import com.assignment2.abstractfactory.MacFactory;
import com.assignment2.abstractfactory.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PART A: Factory Method Demo ===");
        TransportFactory truckFactory = new TruckFactory();
        truckFactory.planDelivery();

        TransportFactory shipFactory = new ShipFactory();
        shipFactory.planDelivery();

        System.out.println("\n=== PART B: Abstract Factory Demo ===");
        // Windows GUI family
        GUIFactory windowsFactory = new WindowsFactory();
        Application app1 = new Application(windowsFactory);
        app1.paint();

        // Mac GUI family
        GUIFactory macFactory = new MacFactory();
        Application app2 = new Application(macFactory);
        app2.paint();
    }
}