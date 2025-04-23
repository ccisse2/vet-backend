
package com.clinic.domain.model.animaux;

import com.clinic.domain.model.consultations.Consultation;
import com.clinic.domain.model.consultations.RendezVous;
import com.clinic.domain.model.utilisateurs.Client;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.UUID;
import static org.assertj.core.api.Assertions.assertThat;

class AnimalTest {

    @Test
    void relationsWork() {
        Animal animal = Animal.builder()
                .id(UUID.randomUUID())
                .nom("Rex")
                .build();

        Client owner = new Client();
        owner.setId(UUID.randomUUID());
        animal.setProprietaire(owner);

        Race race = new Race();
        race.setId(UUID.randomUUID());
        animal.setRace(race);

        DossierMedical dossier = new DossierMedical();
        dossier.setId(UUID.randomUUID());
        dossier.setAnimal(animal);
        animal.setDossierMedical(dossier);

        RendezVous rdv = new RendezVous();
        rdv.setAnimal(animal);
        Consultation consult = new Consultation();
        consult.setAnimal(animal);

        animal.setRendezVous(List.of(rdv));
        animal.setConsultations(List.of(consult));

        assertThat(animal.getProprietaire()).isEqualTo(owner);
        assertThat(animal.getRace()).isEqualTo(race);
        assertThat(animal.getDossierMedical()).isEqualTo(dossier);
        assertThat(animal.getRendezVous()).contains(rdv);
        assertThat(animal.getConsultations()).contains(consult);
    }
}
