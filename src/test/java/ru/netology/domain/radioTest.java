package ru.netology.domain;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void numberStation() {
        radio.setNumberStation(9);
        assertEquals(9, radio.getNumberStation());
    }

    @Test
    void nextNumberStation() {
        radio.setNumberStation(9);
        radio.nextNumberStation();
        assertEquals(0, radio.getNumberStation());
    }

    @Test
    void increaseNumberStation() {
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
    void decreaseNumberStation() {
        radio.setNumberStation(0);
        radio.prevNumberStation();
        assertEquals(9, radio.getNumberStation());
    }
    @Test
    void MaxNumberStation() {
        radio.setNumberStation(-1);
        assertEquals(radio.getLastNumberStation(), radio.getNumberStation());
    }

    @Test
    void MinNumberStation() {
        radio.setNumberStation(10);
        assertEquals(radio.getFirstNumberStation(), radio.getNumberStation());
    }

    @Test
    void soundLevel() {
        radio.setSoundLevel(10);
        assertEquals(10, radio.getSoundLevel());
    }

    @Test
    void increaseSoundLevel() {
        radio.setSoundLevel(8);
        radio.nextSoundLevel();
        assertEquals(9, radio.getSoundLevel());
    }

    @Test
    void decreaseSoundLevel() {
        radio.setSoundLevel(8);
        radio.prevSoundLevel();
        assertEquals(7, radio.getSoundLevel());
    }
    @Test
    void nextSoundLevel() {
        radio.setSoundLevel(9);
        radio.nextSoundLevel();
        radio.nextSoundLevel();
        assertEquals(10, radio.getSoundLevel());
    }

    @Test
    void prevSoundLevel() {
        radio.setSoundLevel(1);
        radio.prevSoundLevel();
        radio.prevSoundLevel();
         assertEquals(0, radio.getSoundLevel());
    }

    @Test
    void maxiSoundLevel() {
        radio.setSoundLevel(11);
        assertEquals(radio.getMaxSoundLevel(), radio.getSoundLevel());
    }

    @Test
    void minSoundLevel() {
        radio.setSoundLevel(-1);
        assertEquals(radio.getMinSoundLevel(), radio.getSoundLevel());
    }
    @Test
    void maximumSoundLevel() {
        radio.setSoundLevel(10);

        assertEquals(radio.getMaxSoundLevel(), radio.getSoundLevel());
    }
    @Test
    void minimumSoundLevel() {
        radio.setSoundLevel(0);
        assertEquals(radio.getMinSoundLevel(), radio.getSoundLevel());
    }

}