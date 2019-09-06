package com.example.libshiv.Inheritance;

public class SimplePhone extends AudioFeature {
    public static void main(String[] args) {
        SimplePhone simplePhone = new SimplePhone();
        simplePhone.playAudio();
        simplePhone.recordAudio();
        simplePhone.mediaPlayer();
        System.out.println("This is Simple Phone Has Audio Features..");
    }
}
