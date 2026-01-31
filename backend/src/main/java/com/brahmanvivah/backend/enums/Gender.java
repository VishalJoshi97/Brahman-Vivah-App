package com.brahmanvivah.backend.enums;

import lombok.Getter;

@Getter
public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    OTHERS("Others");

    private  final String value;

    //value field saves you from migrations.
    Gender(String value){
        this.value=value;
    }
}
