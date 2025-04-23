
package com.clinic.domain.model.animaux;


import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.UUID;
import static org.assertj.core.api.Assertions.assertThat;

class RaceTest {

    @Test
    void animauxListRelation() {
        Race race = new Race();
        race.setId(UUID.randomUUID());
        Animal a = Animal.builder().id(UUID.randomUUID()).build();
        a.setRace(race);
        race.setAnimaux(List.of(a));

        assertThat(race.getAnimaux()).contains(a);
        assertThat(a.getRace()).isEqualTo(race);
    }
}
