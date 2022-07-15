package ru.netology.JavaHome10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();
    @Test
    public void IfMoreStationThanCan() {
        radio.setStationNumber(10);
        int expect = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expect, actual);
    }
    @Test
    public  void IfChangeLimitNumberStationMax() {
        radio.setStationNumber(9);
        int expect = 0;
        int actual = radio.nextStation();
        Assertions.assertEquals(expect, actual);
    }
    @Test
    public void  IfChangeLimitNumberStationMin() {
        radio.setStationNumber(-1);
        int expect = 9;
        int actual = radio.prevStation();
        Assertions.assertEquals(expect, actual);
    }
    @Test
    public void ChangeNumberStationUnderLimit() {
        radio.setStationNumber(5);
        int expect = 6;
        int actual = radio.nextStation();
        Assertions.assertEquals(expect, actual);
    }
    @Test
    public void ChangeNumberStationUnderLimitPrev() {
        radio.setStationNumber(4);
        int expect = 3;
        int actual = radio.prevStation();
        Assertions.assertEquals(expect, actual);
    }
    @Test
    public void IfMoreVolumeThanCan() {
        radio.setVolume(11);
        int expect = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expect, actual);
    }
    @Test
    public void IfMinVolumeThatCan() {
        radio.setVolume(-1);
        int expect = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expect, actual);
    }
    @Test
    public void ChangeVolumeUnderLimit() {
        radio.setVolume(6);
        int expect = 7;
        int actual = radio.volumePlusOne();
        Assertions.assertEquals(expect, actual);
    }
    @Test
    public void ChangeVolumeUnderLimitMin() {
        radio.setVolume(8);
        int expect = 7;
        int actual = radio.volumeMinusOne();
        Assertions.assertEquals(expect,actual);
    }
}
