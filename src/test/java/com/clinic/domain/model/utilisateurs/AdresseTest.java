package com.clinic.domain.model.utilisateurs;


import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class AdresseTest {

    @Test
    void fields() {
        Adresse a = new Adresse();
        UUID id = UUID.randomUUID();
        a.setId(id);
        a.setRue("12 rue A");
        a.setCodePostal("75001");
        a.setVille("Paris");

        assertThat(a.getId()).isEqualTo(id);
        assertThat(a.getVille()).isEqualTo("Paris");
    }
}
