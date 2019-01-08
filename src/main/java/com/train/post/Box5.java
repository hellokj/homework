package com.train.post;


public class Box5 extends Box{
    String box = "Box5";

    public Box5(){
        super(39.5f,27.5f,23);
    }

    @Override
    public String showBox(){
        return box;
    }
}
