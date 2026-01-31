package com.brahmanvivah.backend.enums;

import lombok.Getter;

@Getter
public enum Choice {
    LONG("Long Term"),
    SHORT("Short Term"),
    BOTH("Short Term Open To Long"),
    EXPLORE("Explore The Community"),
    FRIENDS("Make New Friends");

    private  final String value;

    Choice(String value){
        this.value=value;
    }

}
