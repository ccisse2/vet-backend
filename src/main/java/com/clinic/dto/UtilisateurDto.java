package com.clinic.dto;

import java.util.UUID;
import java.time.LocalDate;

import lombok.Data;

@Data
public class UtilisateurDto {
    private UUID id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String telephone;
    private String email;
    private UUID adresseId;
}
