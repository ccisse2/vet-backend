package com.clinic.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class AdresseDto {
    private UUID id;
    private String rue;
    private String codePostal;
    private String ville;
}
