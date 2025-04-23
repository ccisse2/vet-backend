package com.clinic.domain.model.animaux;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DossierMedical {
    @Id
    @GeneratedValue
    private UUID id;

    @OneToMany(mappedBy = "dossier", cascade = CascadeType.ALL)
    private List<NoteMedicale> notes;

    @OneToOne
    private Animal animal;
}
