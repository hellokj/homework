package com.train.post;

public class Box{
    protected float length;
    protected float width;
    protected int height;
    String box = null;

    Box(float length, float width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(float length, float width, int height){
        if(length<=this.length && width<=this.width && height<=this.height)
            return true;
        else return false;
        }

    public String showBox() {
        return box;
    }
}

