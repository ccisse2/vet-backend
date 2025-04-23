package com.clinic.domain.model.utilisateurs;

 import com.clinic.domain.model.animaux.Animal;
 import com.clinic.domain.model.consultations.RendezVous;
 import com.clinic.domain.model.consultations.Facture;
 import org.junit.jupiter.api.Test;

 import java.time.LocalDate;
 import java.util.List;
 import java.util.UUID;

 import static org.assertj.core.api.Assertions.assertThat;

 class ClientTest {

     @Test
     void testAnimauxRelationship() {
         Client client = createClient();
         Animal animal = Animal.builder().id(UUID.randomUUID()).build();
         animal.setProprietaire(client);
         client.setAnimaux(List.of(animal));

         assertThat(client.getAnimaux()).contains(animal);
         assertThat(animal.getProprietaire()).isEqualTo(client);
     }

     @Test
     void testRendezVousRelationship() {
         Client client = new Client();
         RendezVous rendezVous = new RendezVous();
         rendezVous.setClient(client);
         client.setRendezVous(List.of(rendezVous));

         assertThat(client.getRendezVous()).contains(rendezVous);
         assertThat(rendezVous.getClient()).isEqualTo(client);
     }

     @Test
     void testFacturesRelationship() {
         Client client = new Client();
         Facture facture = new Facture();
         facture.setClient(client);
         client.setFactures(List.of(facture));

         assertThat(client.getFactures()).contains(facture);
         assertThat(facture.getClient()).isEqualTo(client);
     }

     @Test
     void testClientAdresse() {
         Client client = new Client();
         client.setAdresse(createAdresse());

         assertThat(client.getAdresse().getRue()).isEqualTo("123 Main St");
         assertThat(client.getAdresse().getCodePostal()).isEqualTo("75001");
         assertThat(client.getAdresse().getVille()).isEqualTo("Paris");
     }

     private Client createClient() {
         return Client.builder()
                 .id(UUID.randomUUID())
                 .nom("Dupont")
                 .prenom("Alice")
                 .dateNaissance(LocalDate.of(2010, 5, 2))
                 .telephone("0123456789")
                 .email("alice@example.com")
                 .adresse(createAdresse())
                 .build();
     }

     private Adresse createAdresse() {
         return Adresse.builder()
                 .rue("123 Main St")
                 .codePostal("75001")
                 .ville("Paris")
                 .build();
     }
 }