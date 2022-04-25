package com.netcracker.ch3;

public class Battery {
    private double fullCapacity;
    private double capacity;

    public Battery(double capacity) {
        this.fullCapacity = capacity;
        this.capacity = fullCapacity;
    }

    public void drain(double amount){
        capacity -= amount;
    }

    public void charge(){
        capacity = fullCapacity;
    }

    public double getRemainingCapacity(){
        return capacity;
    }
}
