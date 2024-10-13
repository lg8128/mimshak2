package com.example.mimshak2;

public class Guitar implements Playable{
    @Override
    public void play(){
        System.out.println("the guitar is palying");
    }

    public void extension(){
        System.out.println("The guitar has a capo");
    }
}
