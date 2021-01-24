package ru.netology.domain;

public class Radio {

    private int numberStation;
    private int soundLevel;
    private int firstNumberStation = 0;
    private int lastNumberStation = 9;

    public int getSoundLevel() {
        return soundLevel;
    }

    public int getMinSoundLevel() {
        return minSoundLevel;
    }

    public int getMaxSoundLevel() {
        return maxSoundLevel;
    }

    private int minSoundLevel = 0;
    private int maxSoundLevel = 10;

    public int getNumberStation() {

        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation > lastNumberStation) {
            this.numberStation = firstNumberStation;
            return;
        }

        if (numberStation < firstNumberStation) {
            this.numberStation = lastNumberStation;
            return;
        }

        this.numberStation = numberStation;
    }

    public void nextNumberStation() {
        numberStation++;
    }

    public void prevNumberStation() {
        numberStation--;
    }

    public void setSoundLevel(int soundLevel) {
        if (soundLevel > maxSoundLevel) {
            this.soundLevel = maxSoundLevel;
            return;
        }
        if (soundLevel < minSoundLevel) {
            this.soundLevel = minSoundLevel;
            return;
        }
        this.soundLevel = soundLevel;
    }

    public void nextSoundLevel() {

        soundLevel++;
    }

    public void prevSoundLevel() {
        soundLevel--;
    }
}