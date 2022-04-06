package com.company.model.room;

public class Room {
    private int number;
    private int comfort_level;
    private int cost;

    Room(int number, int comfort_level, int cost){
        this.number = number;
        this.comfort_level = comfort_level;
        this.cost = cost;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getComfort_level() {
        return comfort_level;
    }

    public void setComfort_level(int comfort_level) {
        this.comfort_level = comfort_level;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
