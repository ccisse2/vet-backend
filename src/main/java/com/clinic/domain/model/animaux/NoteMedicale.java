package com.clinic.domain.model.animaux;

import com.clinic.domain.model.utilisateurs.Personnel;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoteMedicale{
    @Id
    @GeneratedValue
    private UUID id;

    @PastOrPresent
    private LocalDate date;

    @NotBlank
    @Size(min = 2, max = 2000)
    @Column(columnDefinition = "TEXT")
    private String contenu;

    @ManyToOne
    private Personnel auteur;

    @ManyToOne
    private DossierMedical dossier;
}