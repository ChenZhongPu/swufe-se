package com.swufe.guitar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {
    void initInventory(Inventory inventory) {
        inventory.addGuitar(new Guitar(
                new GuitarSpec(Builder.UK, "S003", Type.ELECTIRC,
                11, Wood.BWOOD, Wood.BWOOD), "002", 100));
    }
    @Test
    void search() {
        Inventory inventory = new Inventory();
        initInventory(inventory);

        GuitarSpec spec = new GuitarSpec(Builder.UK, "S003", Type.ELECTIRC,
                11, Wood.BWOOD, Wood.BWOOD);

        assertEquals(inventory.search(spec, 120).getSerialNumber(), "002");
    }
}