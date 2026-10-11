package com.assignment2.abstractfactory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in macOS style.");
    }
}



