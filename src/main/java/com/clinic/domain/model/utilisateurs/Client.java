package com.clinic.domain.model.utilisateurs;

import com.clinic.domain.model.animaux.Animal;
import com.clinic.domain.model.consultations.Facture;
import com.clinic.domain.model.consultations.RendezVous;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(exclude = {"animaux", "mutuelle", "rendezVous"})
public class Client extends Utilisateur{

    @Column(length = 1000)
    private String remarque;

    private boolean archive;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mutuelle_id")
    private Mutuelle mutuelle;

    @SuppressWarnings("java:S1948")
    @OneToMany(mappedBy = "proprietaire", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Animal> animaux;

    @SuppressWarnings("java:S1948")
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RendezVous> rendezVous;

    @SuppressWarnings("java:S1948")
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Facture> factures;
}