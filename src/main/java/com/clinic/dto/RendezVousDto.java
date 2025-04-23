package com.clinic.dto;

import java.util.UUID;
import java.time.LocalDateTime;

import com.clinic.domain.model.consultations.StatutRdv;
import com.clinic.domain.model.consultations.TypeRdv;
import lombok.Data;

@Data
public class RendezVousDto {
    private UUID id;
    private LocalDateTime dateHeure;
    private int duree;
    private TypeRdv type;
    private String remarque;
    private StatutRdv statut;
    private UUID animalId;
    private UUID clientId;
    private UUID personnelId;
    private UUID assistantId;
    private UUID factureId;
    private UUID consultationId;
}
