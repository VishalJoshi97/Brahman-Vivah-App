package com.brahmanvivah.backend.enums;

import lombok.Getter;

@Getter
public enum FamilyType {
    POOR("Poor class"),
    MIDDLE("Middle Class"),
    UPPER("Upper Middle Class"),
    RICH("Rich");

    private final String value;

    FamilyType(String value) {
        this.value = value;
    }
}
