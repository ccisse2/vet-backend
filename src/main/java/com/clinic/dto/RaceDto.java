package com.clinic.dto;

import jakarta.validation.constraints.*;
import java.util.UUID;
import lombok.Data;

@Data
public class RaceDto {

    @NotNull(message = "L'id ne peut pas être nul.")
    private UUID id;

    @NotBlank(message = "L'espèce ne peut pas être vide.")
    @Size(max = 50, message = "L'espèce ne peut pas dépasser 50 caractères.")
    private String espece;

    @NotBlank(message = "Le nom de la race ne peut pas être vide.")
    @Size(max = 50, message = "Le nom de la race ne peut pas dépasser 50 caractères.")
    private String nomRace;
}