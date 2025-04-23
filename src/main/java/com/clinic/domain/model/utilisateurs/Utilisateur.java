package com.clinic.domain.model.utilisateurs;

    import jakarta.persistence.*;
    import jakarta.validation.constraints.Email;
    import jakarta.validation.constraints.NotBlank;
    import jakarta.validation.constraints.PastOrPresent;
    import jakarta.validation.constraints.Pattern;
    import lombok.*;
    import lombok.experimental.SuperBuilder;

    import java.time.LocalDate;
    import java.util.UUID;

    @Entity
    @Getter
    @Setter
    @Inheritance(strategy = InheritanceType.JOINED)
    @NoArgsConstructor
    @AllArgsConstructor
    @SuperBuilder
    @ToString(exclude = "adresse")
    @EqualsAndHashCode(onlyExplicitlyIncluded = true)
    public abstract class Utilisateur{

        @Id
        @GeneratedValue
        @Column(updatable = false, nullable = false)
        @EqualsAndHashCode.Include
        private UUID id;

        @NotBlank
        @Column(nullable = false, length = 50)
        private String nom;

        @NotBlank
        @Column(nullable = false, length = 50)
        private String prenom;

        @NotBlank
        @PastOrPresent
        @Column(nullable = false)
        private LocalDate dateNaissance;

        @Column(length = 15)
        @Pattern(
                regexp = "^0[1-9]\\d{8}$",
                message = "Le numéro de téléphone doit être au format 0XXXXXXXXX"
        )
        private String telephone;

        @Email
        @Column(nullable = false, unique = true, length = 50)
        private String email;

        @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
        @JoinColumn(name = "adresse_id", nullable = false)
        private Adresse adresse;
    }