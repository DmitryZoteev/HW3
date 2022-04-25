package com.netcracker.ch3;

public class Person {
    private String name;
    private String friends;

    public Person(String name) {
        this.name = name;
        this.friends = "";
    }

    public void befriend(Person p){
        friends += p.getName() + " ";
    }

    public void unfriend(Person p){
        friends = friends.replace(p.getName() + " ", "");
    }

    public String getName() {
        return name;
    }

    public String getFriendNames(){
        return friends;
    }

    public int getFriendCount(){
        return friends.split(" ").length;
    }
}
