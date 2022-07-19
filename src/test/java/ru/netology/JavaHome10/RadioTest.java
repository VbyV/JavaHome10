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
        radio.setVolume(111);
        int expect = 100;
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
    @Test
    public void ChangeNumberOverStandartMax() {
        Radio radio = new Radio(15);
        radio.setStationNumber(11);
       Assertions.assertEquals(15, radio.getStationNumber());
    }
    @Test
    public void ReturnMaxStationNumber() {
        Assertions.assertEquals(9, radio.getMaxStationNumber());
    }
    @Test
    public void ReturnMinStationNumber() {
        Assertions.assertEquals(0, radio.getMinStationNumber());
    }
    @Test
    public void ReturnMaxVolume() {
        Assertions.assertEquals(100, radio.getMaxVolume());
    }
    @Test
    public void ReturnMinVolume() {
        Assertions.assertEquals(0, radio.getMinVolume());
    }
    @Test
    public void ReturnStandartVolume() {
     Assertions.assertEquals(0, radio.getVolume());
    }
}
