package com.clinic.dto;

import java.util.UUID;
import java.time.LocalDate;

import com.clinic.domain.model.utilisateurs.Fonction;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class PersonnelDto {
    private UUID id;

    @NotBlank
    @Size(max = 50)
    private String nom;

    @NotBlank
    @Size(max = 50)
    private String prenom;

    @Past
    private LocalDate dateNaissance;

    @NotBlank
    @Pattern(regexp = "\\+?[0-9. ()-]{7,25}", message = "Numéro de téléphone invalide")
    private String telephone;

    @NotBlank
    @Email
    private String email;

    @NotNull
    private Fonction fonction;

    private UUID adresseId;
}