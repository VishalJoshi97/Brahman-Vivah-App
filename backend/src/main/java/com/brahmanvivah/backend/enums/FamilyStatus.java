package com.brahmanvivah.backend.enums;

import lombok.Getter;

@Getter
public enum FamilyStatus {
    NUCLEAR("Nuclear Family"),
    JOINT("Joint Family");

    private final String value;

    FamilyStatus(String value) {
        this.value = value;
    }
}
