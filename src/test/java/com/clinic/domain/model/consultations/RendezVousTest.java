
package com.clinic.domain.model.consultations;

import com.clinic.domain.model.animaux.Animal;
import com.clinic.domain.model.utilisateurs.Personnel;
import com.clinic.domain.model.utilisateurs.Client;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.UUID;
import static org.assertj.core.api.Assertions.assertThat;

class RendezVousTest {

    @Test
    void relationsWork() {
        RendezVous r = new RendezVous();
        r.setId(UUID.randomUUID());
        r.setDateHeure(LocalDateTime.now());
        Animal a = Animal.builder().id(UUID.randomUUID()).build();
        Client cl = new Client();
        cl.setId(UUID.randomUUID());
        Personnel vet = new Personnel();
        vet.setId(UUID.randomUUID());

        r.setAnimal(a);
        r.setClient(cl);
        r.setVeterinaire(vet);

        assertThat(r.getAnimal()).isEqualTo(a);
        assertThat(r.getClient()).isEqualTo(cl);
        assertThat(r.getVeterinaire()).isEqualTo(vet);
    }
}
