package com.assignment2.factorymethod;

public abstract class TransportFactory {
    // Factory Method
    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}




