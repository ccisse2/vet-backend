package com.clinic.dto;

import jakarta.validation.constraints.*;
import java.util.UUID;
import java.time.LocalDateTime;

import com.clinic.domain.model.consultations.StatutRdv;
import com.clinic.domain.model.consultations.TypeRdv;
import lombok.Data;

@Data
public class RendezVousDto {

    @NotNull(message = "L'id ne peut pas être nul.")
    private UUID id;

    @Future(message = "La date et l'heure doivent être dans le futur.")
    @NotNull(message = "La date et l'heure ne peuvent pas être nulles.")
    private LocalDateTime dateHeure;

    @Min(value = 1, message = "La durée doit être d'au moins 1 minute.")
    private int duree;

    @NotNull(message = "Le type de rendez-vous ne peut pas être nul.")
    private TypeRdv type;

    @NotBlank(message = "La remarque ne peut pas être vide.")
    private String remarque;

    @NotNull(message = "Le statut du rendez-vous ne peut pas être nul.")
    private StatutRdv statut;

    @NotNull(message = "L'id de l'animal ne peut pas être nul.")
    private UUID animalId;

    @NotNull(message = "L'id du client ne peut pas être nul.")
    private UUID clientId;

    @NotNull(message = "L'id du personnel ne peut pas être nul.")
    private UUID personnelId;

    private UUID assistantId;

    private UUID factureId;

    private UUID consultationId;
}