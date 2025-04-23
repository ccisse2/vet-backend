package com.clinic.domain.model.utilisateurs;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Fonction {
    SECRETAIRE, VETERINAIRE, ASSISTANT;

    @JsonValue
    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}
