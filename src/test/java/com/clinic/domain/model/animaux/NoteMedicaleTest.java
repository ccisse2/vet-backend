
package com.clinic.domain.model.animaux;

import com.clinic.domain.model.utilisateurs.Personnel;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.UUID;
import static org.assertj.core.api.Assertions.assertThat;

class NoteMedicaleTest {

    @Test
    void authorAndDossierRelation() {
        NoteMedicale note = new NoteMedicale();
        note.setId(UUID.randomUUID());
        note.setDate(LocalDate.now());

        Personnel author = new Personnel();
        author.setId(UUID.randomUUID());
        note.setAuteur(author);

        DossierMedical dossier = new DossierMedical();
        dossier.setId(UUID.randomUUID());
        note.setDossier(dossier);

        assertThat(note.getAuteur()).isEqualTo(author);
        assertThat(note.getDossier()).isEqualTo(dossier);
    }
}
