package com.swufe.guitar;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new ArrayList<>();
    }

    public void addGuitar(Guitar guitar) {
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber))
                return guitar;
        }
        return null;
    }

    public Guitar search(GuitarSpec guitarSpec, double price) {
        for (Guitar guitar : guitars) {
            if (guitar.getGuitarSpec().matches(guitarSpec) &&
            guitar.getPrice() <= price) {
                return guitar;
            }
        }
        return null;
    }
}
