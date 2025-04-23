
package com.clinic.domain.model.animaux;

import org.junit.jupiter.api.Test;
import java.util.UUID;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class DossierMedicalTest {

    @Test
    void notesAndAnimalRelationship() {
        DossierMedical dossier = new DossierMedical();
        dossier.setId(UUID.randomUUID());

        NoteMedicale note = new NoteMedicale();
        note.setId(UUID.randomUUID());
        note.setDossier(dossier);

        dossier.setNotes(List.of(note));

        Animal animal = Animal.builder().id(UUID.randomUUID()).build();
        dossier.setAnimal(animal);

        assertThat(dossier.getNotes()).contains(note);
        assertThat(note.getDossier()).isEqualTo(dossier);
        assertThat(dossier.getAnimal()).isEqualTo(animal);
    }
}
