package com.clinic.dto;

import jakarta.validation.constraints.*;
import java.util.UUID;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class FactureDto {

    @NotNull(message = "L'id ne peut pas être nul.")
    private UUID id;

    @PositiveOrZero(message = "Le montant doit être positif ou égal à zéro.")
    private double montant;

    @NotNull(message = "Le statut de paiement ne peut pas être nul.")
    private boolean payee;

    @PastOrPresent(message = "La date d'émission doit être dans le passé ou le présent.")
    @NotNull(message = "La date d'émission ne peut pas être nulle.")
    private LocalDateTime dateEmission;

    @FutureOrPresent(message = "La date de paiement doit être dans le futur ou le présent.")
    @NotNull(message = "La date de paiement ne peut pas être nulle.")
    private LocalDateTime datePaiement;

    @NotBlank(message = "Le mode de paiement ne peut pas être vide.")
    private String modePaiement;

    @NotNull(message = "L'id du client ne peut pas être nul.")
    private UUID clientId;
}