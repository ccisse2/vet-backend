package com.clinic.domain.model.animaux;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(exclude = "animaux")
public class Race{
    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    private String espece;

    @NotBlank
    private String nomRace;

    @OneToMany(mappedBy = "race")
    private List<Animal> animaux;
}
