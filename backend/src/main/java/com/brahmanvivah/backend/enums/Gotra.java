package com.brahmanvivah.backend.enums;

import lombok.Getter;

@Getter
public enum Gotra {
    ATRI("Atri"),
    BHARADWAJ("Bharadwaj"),
    KASHYAP("Kashyap"),
    KAUSHIK("Kaushik"),
    VASHISHTA("Vashista"),
    GAUTAM("Gautam");

    private  final String value;
    Gotra(String value){
        this.value=value;
    }
}
