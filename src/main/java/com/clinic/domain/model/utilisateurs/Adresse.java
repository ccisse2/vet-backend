package com.clinic.domain.model.utilisateurs;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "adresses")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Adresse{
    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private UUID id;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String rue;

    @NotBlank
    @Size(min = 5, max = 10)
    @Column(nullable = false, length = 10)
    private String codePostal;

    @NotBlank
    @Column(nullable = false, length = 50)
    private String ville;
}