package com.swufe.guita;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    void init(Inventory inventory) {
        inventory.addGuitar("001", Builder.CHINA, "A101", Type.ELECTIRC,
                Wood.AWOOD, Wood.AWOOD, 100);
        inventory.addGuitar("002", Builder.CHINA, "NJ208", Type.ELECTIRC,
                Wood.AWOOD, Wood.BWOOD, 120);
        inventory.addGuitar("011", Builder.USA, "K110", Type.ACOUSTIC,
                Wood.AWOOD, Wood.AWOOD, 180);
        inventory.addGuitar("020", Builder.UK, "S112-s", Type.ELECTIRC,
                Wood.BWOOD, Wood.AWOOD, 160);
        inventory.addGuitar("022", Builder.UK, "S330", Type.ELECTIRC,
                Wood.AWOOD, Wood.AWOOD, 180);
        inventory.addGuitar("023", Builder.UK, "S330-s", Type.ACOUSTIC,
                Wood.BWOOD, Wood.AWOOD, 200);
    }

    @Test
    void search() {
        Inventory inventory = new Inventory();
        init(inventory);

        Guitar guitar = new Guitar(null, Builder.UK, "S330", Type.ELECTIRC,
                Wood.AWOOD, Wood.AWOOD, 200);
        assertEquals(inventory.search(guitar).getSerialNumber(), "022");

        guitar = new Guitar(null, Builder.UK, "s330", Type.ELECTIRC,
                Wood.AWOOD, Wood.AWOOD, 200);
        assertEquals(inventory.search(guitar).getSerialNumber(), "022");

        guitar = new Guitar(null, Builder.UK, "s330", Type.ELECTIRC,
                Wood.AWOOD, Wood.AWOOD, 150);
        assertNull(inventory.search(guitar));
    }
}