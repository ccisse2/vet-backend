package com.clinic.domain.model.utilisateurs;

    import jakarta.persistence.*;
    import jakarta.validation.constraints.NotBlank;
    import lombok.*;

    import java.util.UUID;

    @Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @EqualsAndHashCode(onlyExplicitlyIncluded = true)
    @ToString
    public class Mutuelle{
        @Id
        @GeneratedValue
        @Column(nullable = false, updatable = false)
        private UUID id;

        @NotBlank
        @Column(nullable = false, length = 100)
        private String nom;

        @NotBlank
        @Column(nullable = false, length = 50)
        private String type;

        @NotBlank
        @Column(nullable = false, length = 50)
        private String numeroContrat;
    }