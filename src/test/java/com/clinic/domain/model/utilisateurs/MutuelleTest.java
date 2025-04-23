package com.clinic.domain.model.utilisateurs;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;

class MutuelleTest {

    @Test
    void gettersAndSetters_shouldWork() {
        UUID id = UUID.randomUUID();
        Mutuelle m = new Mutuelle();
        m.setId(id);
        m.setNom("AssurVet");
        m.setType("Senior");
        m.setNumeroContrat("C123");
        
        assertThat(m.getId()).isEqualTo(id);
        assertThat(m.getNom()).isEqualTo("AssurVet");
        assertThat(m.getType()).isEqualTo("Senior");
        assertThat(m.getNumeroContrat()).isEqualTo("C123");
    }
}
