package com.example.libshiv.Inheritance;

public class AudioFeature implements AudioPlayer,AudioRecorder{
    @Override
    public void playAudio() {
        System.out.println("This Can Play Audio..");
    }

    @Override
    public void recordAudio() {
        System.out.println("This Can Record Audio..");

    }
    public void mediaPlayer(){
        System.out.println("This Can Play Media..");
    }
}
