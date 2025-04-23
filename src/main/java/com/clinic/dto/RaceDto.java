package com.clinic.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class RaceDto {
    private UUID id;
    private String espece;
    private String nomRace;
}
