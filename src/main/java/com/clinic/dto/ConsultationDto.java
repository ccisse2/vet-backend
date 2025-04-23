package com.clinic.dto;

import java.util.UUID;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Data
public class ConsultationDto {
    private UUID id;
    private String resume;
    private LocalDateTime date;
    private List<String> prescriptions;
    private UUID personnelId;
    private UUID rendezVousId;
}
