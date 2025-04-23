package com.clinic.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class MutuelleDto {
    private UUID id;
    private String nom;
    private String type;
    private String numeroContrat;
}
