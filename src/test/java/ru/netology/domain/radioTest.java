package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {
    radio radio = new radio();

    @Test
    void numberStation() {
        radio.setNumberStation(9);
        radio.getNumberStation();
        assertEquals(9, radio.getNumberStation());
    }

    @Test
    void nextNumberStation() {
        radio.setNumberStation(8);
        radio.nextNumberStation();
        assertEquals(9, radio.getNumberStation());
    }

    @Test
    void prevNumberStation() {
        radio.setNumberStation(8);
        radio.prevNumberStation();
        assertEquals(7, radio.getNumberStation());
    }

    @Test
    void soundLevel() {
        radio.setSoundLevel(10);
        radio.getSoundLevel();
        assertEquals(10, radio.getSoundLevel());
    }

    @Test
    void nextSoundLevel() {
        radio.setSoundLevel(8);
        radio.nextSoundLevel();
        assertEquals(9, radio.getSoundLevel());
    }

    @Test
    void prevSoundLevel() {
        radio.setSoundLevel(8);
        radio.prevSoundLevel();
        assertEquals(7, radio.getSoundLevel());
    }


    @Test
    void maxiSoundLevel() {
        radio.setSoundLevel(11);
        radio.getMaxSoundLevel();
        assertEquals(10, radio.getSoundLevel());
    }

    @Test
    void minimumSoundLevel() {
        radio.setSoundLevel(-1);
        radio.getMinSoundLevel();
        assertEquals(0, radio.getSoundLevel());
    }

    @Test
    void prevMaxNumberStation() {
        radio.setNumberStation(-1);
        radio.getNumberStation();
        assertEquals(9, radio.getNumberStation());
    }

    @Test
    void nextMinNumberStation() {
        radio.setNumberStation(10);
        radio.getNumberStation();
        assertEquals(0, radio.getNumberStation());
    }

}