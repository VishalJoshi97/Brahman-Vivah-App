package com.brahmanvivah.backend.enums;

import lombok.Getter;

@Getter
public enum SexualOrientation {
    STRAIGHT("Straight"),
    GAY("Gay"),
    BISEXUAL("Bisexual"),
    ASEXUAL("Asexual");

    private  final String value;

    SexualOrientation(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}

