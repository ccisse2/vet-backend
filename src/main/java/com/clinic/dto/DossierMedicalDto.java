package com.clinic.dto;

import jakarta.validation.constraints.*;
import java.util.UUID;
import java.util.List;
import lombok.Data;

@Data
public class DossierMedicalDto {

    @NotNull(message = "L'id ne peut pas être nul.")
    private UUID id;

    @NotEmpty(message = "La liste des notes médicales ne peut pas être vide.")
    private List<@NotNull(message = "L'id d'une note médicale ne peut pas être nul.") UUID> noteIds;

    @NotEmpty(message = "La liste des historiques de rendez-vous ne peut pas être vide.")
    private List<@NotNull(message = "L'id d'un historique de rendez-vous ne peut pas être nul.") UUID> historiqueRendezVousIds;
}