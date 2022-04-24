package com.swufe.guita;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, Builder builder, String model, Type type, Wood backWood, Wood topWood, double price) {
        Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber))
                return guitar;
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar) {
        for (Guitar guitar : guitars) {
            // ignore serial number since it is unique
            if (guitar.getBuilder() == searchGuitar.getBuilder() &&
            guitar.getModel().equalsIgnoreCase(searchGuitar.getModel()) &&
            guitar.getBackWood() == searchGuitar.getBackWood() &&
            guitar.getTopWood() == searchGuitar.getTopWood() &&
            guitar.getPrice() <= searchGuitar.getPrice()) {
                return guitar;
            }
        }
        return null;
    }
}
