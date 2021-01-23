package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {
    radio radio = new radio();

    @Test
    void numberStation(){
        radio.setNumberStation(10);
        radio.nextNumberStation();
        assertEquals(1, radio.getNumberStation());
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
    void soundLevel(){
        radio.setSoundLevel(11);
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
}