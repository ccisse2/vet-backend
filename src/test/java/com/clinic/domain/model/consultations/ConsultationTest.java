
package com.clinic.domain.model.consultations;

import com.clinic.domain.model.animaux.Animal;
import com.clinic.domain.model.utilisateurs.Personnel;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import static org.assertj.core.api.Assertions.assertThat;

class ConsultationTest {

    @Test
    void relationsWork() {
        Consultation c = new Consultation();
        c.setId(UUID.randomUUID());
        c.setResume("Checkup");
        c.setDate(LocalDateTime.now());

        Animal animal = Animal.builder().id(UUID.randomUUID()).build();
        Personnel vet = new Personnel();
        vet.setId(UUID.randomUUID());

        c.setAnimal(animal);
        c.setVeterinaire(vet);
        c.setPrescriptions(List.of("Drug A"));
        RendezVous rdv = new RendezVous();
        rdv.setId(UUID.randomUUID());
        c.setRendezVous(rdv);

        Facture f = new Facture();
        f.setId(UUID.randomUUID());
        f.setConsultation(c);
        c.setFacture(f);

        assertThat(c.getAnimal()).isEqualTo(animal);
        assertThat(c.getVeterinaire()).isEqualTo(vet);
        assertThat(c.getPrescriptions()).contains("Drug A");
        assertThat(c.getRendezVous()).isEqualTo(rdv);
        assertThat(c.getFacture()).isEqualTo(f);
    }
}
