package com.brahmanvivah.backend.enums;

import lombok.Getter;

@Getter
public enum Habits {
    SMOKING("Smoking"),
    DRINKING("Drinking"),
    NON_SMOKER("Non Smoker"),
    OCCASIONAL("Occasional");

    private final String value;

    Habits(String value){
        this.value=value;
    }

}
