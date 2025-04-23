package com.clinic.dto;

import jakarta.validation.constraints.*;
import java.util.UUID;
import lombok.Data;

@Data
public class MutuelleDto {

    @NotNull(message = "L'id ne peut pas être nul.")
    private UUID id;

    @NotBlank(message = "Le nom ne peut pas être vide.")
    @Size(max = 100, message = "Le nom ne peut pas dépasser 100 caractères.")
    private String nom;

    @NotBlank(message = "Le type ne peut pas être vide.")
    @Size(max = 50, message = "Le type ne peut pas dépasser 50 caractères.")
    private String type;

    @NotBlank(message = "Le numéro de contrat ne peut pas être vide.")
    @Size(max = 50, message = "Le numéro de contrat ne peut pas dépasser 50 caractères.")
    private String numeroContrat;
}