package com.java.code.assignment.entity;

import com.java.code.assignment.enums.SoundEnums;

public class Sounds {
    private SoundEnums soundEnums;

    public Sounds(SoundEnums soundEnums) {
        this.soundEnums = soundEnums;
    }

    public void makeSound() {
        System.out.println(soundEnums.getSound());
    }
}
