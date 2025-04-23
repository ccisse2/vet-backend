package com.clinic.domain.model.animaux;

        import com.clinic.domain.model.consultations.Consultation;
        import com.clinic.domain.model.consultations.RendezVous;
        import com.clinic.domain.model.utilisateurs.Client;
        import jakarta.persistence.*;
        import jakarta.validation.constraints.*;
        import lombok.*;
        import lombok.experimental.SuperBuilder;

        import java.time.LocalDate;
        import java.util.List;
        import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "animaux")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(exclude = {"proprietaire", "race", "dossierMedical", "rendezVous", "consultations"})
public class Animal{

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private UUID id;

    @Size(max = 50)
    @NotBlank
    private String nom;

    @NotBlank
    private String sexe;

    @NotBlank
    private String couleur;

    @PastOrPresent
    private LocalDate dateNaissance;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Client proprietaire;

    @ManyToOne(fetch = FetchType.EAGER)
    private Race race;

    @OneToOne(mappedBy = "animal", cascade = CascadeType.ALL, optional = true)
    private DossierMedical dossierMedical;

    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RendezVous> rendezVous;

    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Consultation> consultations;

    @Size(max = 50)
    private String tatouage;

    private boolean archive;
}