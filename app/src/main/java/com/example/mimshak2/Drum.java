package com.example.mimshak2;

public class Drum implements Playable{
    @Override
    public void play(){
        System.out.println("the drums is playing");
    }
        public void  noise(){
        System.out.println("The drums have a loud noise");
    }
}
