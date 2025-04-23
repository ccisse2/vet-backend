package com.clinic.dto;

import java.util.UUID;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class FactureDto {
    private UUID id;
    private double montant;
    private boolean payee;
    private LocalDateTime dateEmission;
    private LocalDateTime datePaiement;
    private String modePaiement;
    private UUID clientId;
}
