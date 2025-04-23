package com.clinic.dto;

import jakarta.validation.constraints.*;
import java.util.UUID;
import java.time.LocalDate;
import lombok.Data;

@Data
public class NoteMedicaleDto {

    @NotNull(message = "L'id ne peut pas être nul.")
    private UUID id;

    @PastOrPresent(message = "La date doit être dans le passé ou le présent.")
    @NotNull(message = "La date ne peut pas être nulle.")
    private LocalDate date;

    @NotBlank(message = "Le contenu ne peut pas être vide.")
    @Size(min = 2, max = 2000, message = "Le contenu doit contenir entre 2 et 2000 caractères.")
    private String contenu;

    @NotNull(message = "L'id de l'auteur ne peut pas être nul.")
    private UUID auteurId;
}