package com.clinic.dto;

import jakarta.validation.constraints.*;
import java.util.UUID;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Data
public class ConsultationDto {

    @NotNull(message = "L'id ne peut pas être nul.")
    private UUID id;

    @NotBlank(message = "Le résumé ne peut pas être vide.")
    @Size(min = 2, max = 1000, message = "Le résumé doit contenir entre 2 et 1000 caractères.")
    private String resume;

    @FutureOrPresent(message = "La date doit être dans le futur ou le présent.")
    @NotNull(message = "La date ne peut pas être nulle.")
    private LocalDateTime date;

    @NotEmpty(message = "La liste des prescriptions ne peut pas être vide.")
    private List<@NotBlank(message = "Une prescription ne peut pas être vide.") String> prescriptions;

    @NotNull(message = "L'id du personnel ne peut pas être nul.")
    private UUID personnelId;

    @NotNull(message = "L'id du rendez-vous ne peut pas être nul.")
    private UUID rendezVousId;
}