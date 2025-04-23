package com.clinic.dto;

import jakarta.validation.constraints.*;
import java.util.UUID;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class ClientDto {

    @NotNull(message = "L'id ne peut pas être nul.")
    private UUID id;

    @NotBlank(message = "Le nom ne peut pas être vide.")
    @Size(max = 100, message = "Le nom ne peut pas dépasser 100 caractères.")
    private String nom;

    @NotBlank(message = "Le prénom ne peut pas être vide.")
    @Size(max = 100, message = "Le prénom ne peut pas dépasser 100 caractères.")
    private String prenom;

    @Past(message = "La date de naissance doit être dans le passé.")
    private LocalDate dateNaissance;

    @NotBlank(message = "Le numéro de téléphone ne peut pas être vide.")
    @Size(max = 15, message = "Le numéro de téléphone ne peut pas dépasser 15 caractères.")
    private String telephone;

    @Email(message = "L'email doit être valide.")
    @NotBlank(message = "L'email ne peut pas être vide.")
    private String email;

    @Size(max = 1000, message = "La remarque ne peut pas dépasser 1000 caractères.")
    private String remarque;

    @NotNull(message = "Le statut d'archivage ne peut pas être nul.")
    private Boolean archive;

    private UUID adresseId;

    private UUID mutuelleId;

    private List<UUID> animauxIds;
}