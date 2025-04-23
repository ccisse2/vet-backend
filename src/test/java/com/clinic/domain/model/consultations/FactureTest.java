
package com.clinic.domain.model.consultations;

import com.clinic.domain.model.utilisateurs.Client;
import org.junit.jupiter.api.Test;
import java.util.UUID;
import static org.assertj.core.api.Assertions.assertThat;

class FactureTest {

    @Test
    void clientAndConsultationRelation() {
        Facture f = new Facture();
        f.setId(UUID.randomUUID());
        f.setClient(new Client());
        Consultation c = new Consultation();
        c.setId(UUID.randomUUID());
        f.setConsultation(c);

        assertThat(f.getClient()).isNotNull();
        assertThat(f.getConsultation()).isEqualTo(c);
    }
}
