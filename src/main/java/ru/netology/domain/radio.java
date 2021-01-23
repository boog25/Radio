package ru.netology.domain;

public class radio {

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
        if (numberStation == lastNumberStation) {
            numberStation = firstNumberStation;
            return;
        }
                            numberStation++;

    }
        public void prevNumberStation() {
            if (numberStation == lastNumberStation){
                numberStation = firstNumberStation;
                return;
            }
            numberStation--;
        }
        public int getFirstNumberStation() {
            return firstNumberStation;
        }

        public int getLastNumberStation() {
            return lastNumberStation;
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
        if (soundLevel == maxSoundLevel)
         return;
        soundLevel++;
    }
    public void prevSoundLevel() {
        if (soundLevel == minSoundLevel)
            return;
        soundLevel--;
    }
}