package com.swufe.guitar;

public class Guitar {
    private GuitarSpec guitarSpec;
    private String serialNumber;
    private double price;

    public Guitar(GuitarSpec guitarSpec, String serialNumber, double price) {
        this.guitarSpec = guitarSpec;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
