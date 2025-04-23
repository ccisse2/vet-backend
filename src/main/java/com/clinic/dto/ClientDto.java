package com.clinic.dto;

import java.util.UUID;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class ClientDto {
    private UUID id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String telephone;
    private String email;
    private String remarque;
    private Boolean archive;
    private UUID adresseId;
    private UUID mutuelleId;
    private List<UUID> animauxIds;
}
