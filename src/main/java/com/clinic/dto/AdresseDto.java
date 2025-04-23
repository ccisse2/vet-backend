package com.clinic.dto;

import jakarta.validation.constraints.*;
import java.util.UUID;
import lombok.Data;

@Data
public class AdresseDto {

    @NotNull(message = "L'id ne peut pas être nul.")
    private UUID id;

    @NotBlank(message = "La rue ne peut pas être vide.")
    @Size(max = 100, message = "La rue ne peut pas dépasser 100 caractères.")
    private String rue;

    @NotBlank(message = "Le code postal ne peut pas être vide.")
    @Pattern(regexp = "\\d{5}", message = "Le code postal doit contenir exactement 5 chiffres.")
    private String codePostal;

    @NotBlank(message = "La ville ne peut pas être vide.")
    @Size(max = 50, message = "La ville ne peut pas dépasser 50 caractères.")
    private String ville;
}