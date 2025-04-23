package com.clinic.dto;

import java.util.UUID;
import java.util.List;
import lombok.Data;

@Data
public class DossierMedicalDto {
    private UUID id;
    private List<UUID> noteIds;
    private List<UUID> historiqueRendezVousIds;
}
