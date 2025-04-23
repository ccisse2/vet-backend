package com.clinic.dto;

import java.util.UUID;
import java.time.LocalDate;

import lombok.Data;

@Data
public class NoteMedicaleDto {
    private UUID id;
    private LocalDate date;
    private String contenu;
    private UUID auteurId;
}
