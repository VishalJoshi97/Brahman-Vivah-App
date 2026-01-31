package com.brahmanvivah.backend.enums;

import lombok.Getter;

@Getter
public enum Caste {
    BRAHMAN("Brahman"),
    KSHATRIYA("Kshatriya");
    private  final String value;

    Caste(String value){
        this.value=value;
    }

}
