package com.example.mimshak2;

public class main {
    public static void main(String[] args) {
        Playable[] playables = new Playable[3];
        playables[0]  = (new Drum());
        playables[1] = (new Piano());
        playables[2] = (new Guitar());

        for (Playable crature : playables) {
            crature.play();
        }
    }
}
