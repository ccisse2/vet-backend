package com.clinic.dto;

import jakarta.validation.constraints.*;
import java.util.UUID;
import java.time.LocalDate;
import lombok.Data;

@Data
public class AnimalDto {

    @NotNull(message = "L'id ne peut pas être nul.")
    private UUID id;

    @NotBlank(message = "Le nom ne peut pas être vide.")
    @Size(max = 50, message = "Le nom ne peut pas dépasser 50 caractères.")
    private String nom;

    @NotBlank(message = "Le sexe ne peut pas être vide.")
    private String sexe;

    @NotBlank(message = "La couleur ne peut pas être vide.")
    private String couleur;

    @PastOrPresent(message = "La date de naissance doit être dans le passé ou le présent.")
    private LocalDate dateNaissance;

    @Size(max = 50, message = "Le tatouage ne peut pas dépasser 50 caractères.")
    private String tatouage;

    @NotNull(message = "Le champ archive ne peut pas être nul.")
    private Boolean archive;

    @NotNull(message = "L'id de la race ne peut pas être nul.")
    private UUID raceId;

    @NotNull(message = "L'id du dossier médical ne peut pas être nul.")
    private UUID dossierMedicalId;

    @NotNull(message = "L'id du propriétaire ne peut pas être nul.")
    private UUID proprietaireId;
}