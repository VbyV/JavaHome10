package ru.netology.JavaHome10;

public class Radio {
    private int maxStationNumber = 9;
    private int minStationNumber = 0;
    private int stationNumber = minStationNumber;

    public Radio() {

    }
    private int minVolume = 0;
    private int maxVolume = 100;
    private int volume = minVolume;

    public int getStationNumber() {
        return stationNumber;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public int getMinStationNumber() {
        return minStationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < minStationNumber) {
            return;
        }
        if (newStationNumber > maxStationNumber) {
            return;
        }
        stationNumber = newStationNumber;
    }
    public int nextStation() {
       stationNumber = stationNumber + 1;
        if (stationNumber > maxStationNumber) {
            return minStationNumber;
        }
        return stationNumber;
    }

    public int prevStation() {
        stationNumber = stationNumber - 1;
        if (stationNumber < minStationNumber) {
            return maxStationNumber;
        }
        return stationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            newVolume = minVolume;
        }
        if (newVolume > maxVolume) {
            newVolume = maxVolume;
        }
        volume = newVolume;
    }

    public int volumePlusOne() {
        volume = volume + 1;
        return volume;
    }

    public int volumeMinusOne() {
        volume = volume - 1;
        return volume;
    }
}
