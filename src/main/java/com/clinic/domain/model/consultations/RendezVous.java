package com.clinic.domain.model.consultations;

    import com.clinic.domain.model.animaux.Animal;
    import com.clinic.domain.model.utilisateurs.Client;
    import com.clinic.domain.model.utilisateurs.Personnel;
    import jakarta.persistence.*;
    import jakarta.validation.constraints.Future;
    import jakarta.validation.constraints.Min;
    import lombok.*;

    import java.time.LocalDateTime;
    import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(exclude = {"animal", "veterinaire", "assistant", "consultation"})
public class RendezVous{

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private UUID id;

    @Future
    @Column(nullable = false)
    private LocalDateTime dateHeure;

    @Min(1)
    @Column(nullable = false)
    private int duree;

    @Enumerated(EnumType.STRING)
    private TypeRdv typeRdv;

    private String remarque;

    @Enumerated(EnumType.STRING)
    private StatutRdv statutRdv;

    @ManyToOne
    @JoinColumn(name = "animal_id", nullable = false)
    private Animal animal;

    @ManyToOne
    @JoinColumn(name = "veterinaire_id", nullable = false)
    private Personnel veterinaire;

    @ManyToOne
    @JoinColumn(name = "assistant_id")
    private Personnel assistant;

    @ManyToOne
    private Client client;

    @OneToOne(mappedBy = "rendezVous", cascade = CascadeType.ALL)
    private Consultation consultation;

}
