package ru.netology.domain;

public class Radio {

    private int numberStation;
    private int soundLevel;
    private int firstNumberStation = 0;
    private int lastNumberStation = 9;
    private int minSoundLevel = 0;
    private int maxSoundLevel = 10;

    public Radio(int numberStation, int soundLevel, int firstNumberStation, int lastNumberStation, int minSoundLevel, int maxSoundLevel) {
        this.numberStation = numberStation;
        this.soundLevel = soundLevel;
        this.firstNumberStation = firstNumberStation;
        this.lastNumberStation = lastNumberStation;
        this.minSoundLevel = minSoundLevel;
        this.maxSoundLevel = maxSoundLevel;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void nextNumberStation() {
        if (numberStation == lastNumberStation) {
            numberStation = firstNumberStation;
            return;
        }
        numberStation++;
    }

    public void nextSoundLevel() {
        if (soundLevel == maxSoundLevel) {
            return;
        }
        soundLevel++;
    }

    public void prevSoundLevel() {
        if (soundLevel == minSoundLevel) {
            return;
        }
        soundLevel--;
    }
}