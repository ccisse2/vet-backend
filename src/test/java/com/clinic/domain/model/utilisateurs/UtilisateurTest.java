package com.clinic.domain.model.utilisateurs;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UtilisateurTest {

    @Test
    void testUtilisateurFields() {
        Adresse adresse = Adresse.builder()
                .rue("123 Rue Exemple")
                .ville("Paris")
                .codePostal("75000")
                .build();

        Personnel personnel = Personnel.builder()
                .id(UUID.randomUUID())
                .nom("Dupont")
                .prenom("Jean")
                .dateNaissance(LocalDate.of(1990, 1, 1))
                .email("jean.dupont@example.com")
                .telephone("0123456789")
                .adresse(adresse)
                .motDePasse("password123")
                .fonction(Fonction.VETERINAIRE)
                .admin(true)
                .build();

        assertNotNull(personnel.getId());
        assertEquals("Dupont", personnel.getNom());
        assertEquals("Jean", personnel.getPrenom());
        assertEquals(LocalDate.of(1990, 1, 1), personnel.getDateNaissance());
        assertEquals("jean.dupont@example.com", personnel.getEmail());
        assertEquals("0123456789", personnel.getTelephone());
        assertEquals(adresse, personnel.getAdresse());
        assertEquals(Fonction.VETERINAIRE, personnel.getFonction());
        assertEquals(true, personnel.getAdmin());
    }
}
