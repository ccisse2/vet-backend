package com.clinic.dto;

import java.util.UUID;
import java.time.LocalDate;

import lombok.Data;

@Data
public class AnimalDto {
    private UUID id;
    private String nom;
    private String sexe;
    private String couleur;
    private LocalDate dateNaissance;
    private String tatouage;
    private Boolean archive;
    private UUID raceId;
    private UUID dossierMedicalId;
    private UUID proprietaireId;
}
