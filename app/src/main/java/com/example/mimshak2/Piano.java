package com.example.mimshak2;

public class Piano implements Playable{
    @Override
    public void play(){
        System.out.println("the piano is playing");
    }
    public void  elements(){
        System.out.println("A piano has keys");
    }
}
