package com.clinic.domain.model.utilisateurs;

import com.clinic.domain.model.consultations.Consultation;
import com.clinic.domain.model.consultations.RendezVous;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
@ToString(callSuper = true, exclude = {"rendezVousVeterinaire", "rendezVousAssistant", "consultation"})
public class Personnel extends Utilisateur{

    @NotBlank
    @Column(nullable = false)
    @JsonIgnore
    private String motDePasse;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private Fonction fonction;

    private Boolean admin;

    @OneToMany(mappedBy = "veterinaire", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RendezVous> rendezVousVeterinaire;

    @OneToMany(mappedBy = "assistant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RendezVous> rendezVousAssistant;

    @OneToMany(mappedBy = "veterinaire", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Consultation> consultation;

}