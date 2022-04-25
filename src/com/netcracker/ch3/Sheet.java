package com.netcracker.ch3;

public class Sheet {
    private double height;
    private double weight;
    private int lvl;

    public Sheet(){
        weight = 841;
        height = 1189;
        lvl = 0;
    }

    public void cutInHalf(){
        int temp = (int)height / 2;
        height = weight;
        weight = temp;
        lvl++;
    }

    public String getName(){
        return "A" + lvl;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
