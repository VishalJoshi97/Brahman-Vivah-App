package com.brahmanvivah.backend.enums;

import lombok.Getter;

@Getter
public enum SubCaste {
    SMARTH("Smarth"),
    VAISHNAV("Vaishnav"),
    MADHWA("Madhwa");

    private final String value;

    SubCaste(String value){
        this.value=value;
    }

}
