package com.clinic.domain.model.utilisateurs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnelTest {

    @Test
    void testPersonnelMotDePasse() {
        Personnel personnel = new Personnel();
        personnel.setMotDePasse("securePassword123");

        assertEquals("securePassword123", personnel.getMotDePasse());
    }

    @Test
    void testPersonnelFonction() {
        Personnel personnel = new Personnel();
        personnel.setFonction(Fonction.VETERINAIRE);

        assertEquals(Fonction.VETERINAIRE, personnel.getFonction());
    }

    @Test
    void testPersonnelAdmin() {
        Personnel personnel = new Personnel();
        personnel.setAdmin(true);

        assertTrue(personnel.getAdmin());
    }
}
