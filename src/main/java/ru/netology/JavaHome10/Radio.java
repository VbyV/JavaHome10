package ru.netology.JavaHome10;

public class Radio {
    private int StationNumber;
    private int volume;

    public int getStationNumber() {
        return StationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > 9) {
            return;
        }
        StationNumber = newStationNumber;
    }
    public int nextStation() {
        StationNumber = StationNumber + 1;
        if (StationNumber > 9) {
            return 0;
        }
        return StationNumber;
    }
    public int prevStation() {
        StationNumber = StationNumber -1;
        if (StationNumber < 0) {
            return  9;
        }
        return StationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            newVolume = 0;
        }
        if (newVolume > 10) {
            newVolume = 10;
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
