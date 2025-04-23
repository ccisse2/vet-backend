// Fichier : src/test/java/com/clinic/domain/model/utilisateurs/FonctionTest.java
package com.clinic.domain.model.utilisateurs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FonctionTest {

    @Test
    void testToLowerCase() {
        assertEquals("secretaire", Fonction.SECRETAIRE.toLowerCase());
        assertEquals("veterinaire", Fonction.VETERINAIRE.toLowerCase());
        assertEquals("assistant", Fonction.ASSISTANT.toLowerCase());
    }
}