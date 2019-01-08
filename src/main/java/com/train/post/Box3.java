package com.train.post;

public class Box3 extends Box{
    String box = "Box3";
    public Box3(){
        super(23f,14f,13);
    }

    @Override
    public String showBox(){
        return box;
    }
}
