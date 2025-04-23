package com.clinic.domain.model.consultations;

import com.clinic.domain.model.animaux.Animal;
import com.clinic.domain.model.utilisateurs.Personnel;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(exclude = {"animal", "veterinaire", "rendezVous", "facture"})
public class Consultation{

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private UUID id;

    @NotBlank
    @Size(min = 2, max = 1000)
    private String resume;

    @FutureOrPresent
    private LocalDateTime date;

    @ElementCollection
    private List<@NotBlank String> prescriptions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "veterinaire_id", nullable = false)
    private Personnel veterinaire;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "animal_id", nullable = false)
    private Animal animal;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rendezvous_id", nullable = false)
    private RendezVous rendezVous;

    @OneToOne(mappedBy = "consultation", cascade = CascadeType.ALL)
    private Facture facture;
}
