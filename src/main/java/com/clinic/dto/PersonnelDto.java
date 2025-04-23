package com.clinic.dto;

import java.util.UUID;
import java.time.LocalDate;

import com.clinic.domain.model.utilisateurs.Fonction;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class PersonnelDto {

    @NotNull(message = "L'id ne peut pas être nul.")
    private UUID id;

    @NotBlank(message = "Le nom ne peut pas être vide.")
    @Size(max = 50, message = "Le nom ne peut pas dépasser 50 caractères.")
    private String nom;

    @NotBlank(message = "Le prénom ne peut pas être vide.")
    @Size(max = 50, message = "Le prénom ne peut pas dépasser 50 caractères.")
    private String prenom;

    @Past(message = "La date de naissance doit être dans le passé.")
    private LocalDate dateNaissance;

    @NotBlank(message = "Le numéro de téléphone ne peut pas être vide.")
    @Pattern(regexp = "\\+?[0-9. ()-]{7,25}", message = "Numéro de téléphone invalide.")
    private String telephone;

    @NotBlank(message = "L'email ne peut pas être vide.")
    @Email(message = "L'email doit être valide.")
    private String email;

    @NotNull(message = "La fonction ne peut pas être nulle.")
    private Fonction fonction;

    private UUID adresseId;
}