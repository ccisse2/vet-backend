package com.clinic.domain.model.consultations;

        import com.clinic.domain.model.utilisateurs.Client;
        import jakarta.persistence.*;
        import jakarta.validation.constraints.*;
        import lombok.*;

        import java.time.LocalDateTime;
        import java.util.UUID;

        @Entity
        @Getter
        @Setter
        @NoArgsConstructor
        @AllArgsConstructor
        @Builder
        @EqualsAndHashCode(onlyExplicitlyIncluded = true)
        @ToString(exclude = {"client", "consultation"})
        public class Facture{

            @Id
            @GeneratedValue
            @EqualsAndHashCode.Include
            private UUID id;

            @PositiveOrZero
            private double montant;

            @Column(nullable = false)
            private boolean payee;

            @PastOrPresent
            private LocalDateTime dateEmission;

            @NotBlank
            private String modePaiement;

            @FutureOrPresent
            private LocalDateTime datePaiement;

            @ManyToOne
            @JoinColumn(name = "client_id", nullable = false)
            private Client client;

            @OneToOne
            @JoinColumn(name = "consultation_id", nullable = false)
            private Consultation consultation;
        }