package ru.netology.domain;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void radioNumber() {
        Radio radio = new Radio(9, 10, 0, 10, 0, 100);
        assertEquals(10, radio.getLastNumberStation());
    }

    @Test
    void nextNumberStation() {
        Radio radio = new Radio(9, 10, 0, 10, 0, 100);
        radio.nextNumberStation();
        assertEquals(10, radio.getNumberStation());
    }

    @Test
    void increaseNumberStation() {
        Radio radio = new Radio(10, 10, 0, 10, 0, 100);
        radio.nextNumberStation();
        assertEquals(0, radio.getNumberStation());
    }

    @Test
    void prevNumberStation() {
        Radio radio = new Radio(9, 10, 0, 10, 0, 100);
        radio.prevNumberStation();
        assertEquals(8, radio.getNumberStation());
    }

    @Test
    void decreaseNumberStation() {
        Radio radio = new Radio(0, 10, 0, 10, 0, 100);
        radio.prevNumberStation();
        assertEquals(10, radio.getNumberStation());
    }

    @Test
    void soundLevel() {
        Radio radio = new Radio(9, 40, 0, 10, 0, 100);
        assertEquals(40, radio.getSoundLevel());
    }

    @Test
    void increaseSoundLevel() {
        Radio radio = new Radio(9, 10, 0, 10, 0, 100);
        radio.nextSoundLevel();
        assertEquals(11, radio.getSoundLevel());
    }

    @Test
    void decreaseSoundLevel() {
        Radio radio = new Radio(9, 10, 0, 10, 0, 100);
        radio.prevSoundLevel();
        assertEquals(9, radio.getSoundLevel());
    }

    @Test
    void nextSoundLevel() {
        Radio radio = new Radio(9, 99, 0, 10, 0, 100);
        radio.nextSoundLevel();
        radio.nextSoundLevel();
        assertEquals(100, radio.getSoundLevel());
    }

    @Test
    void prevSoundLevel() {
        Radio radio = new Radio(9, 1, 0, 10, 0, 100);
        radio.prevSoundLevel();
        radio.prevSoundLevel();
        assertEquals(0, radio.getSoundLevel());
    }
}