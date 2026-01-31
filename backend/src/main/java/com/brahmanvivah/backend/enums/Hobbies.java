package com.brahmanvivah.backend.enums;

public enum Hobbies {
    TRAVEL("Travel"),
    MUSIC("Music"),
    READING("Reading"),
    FITNESS("Fitness"),
    MOVIES("Movies");

        private final String value;

        Hobbies(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
