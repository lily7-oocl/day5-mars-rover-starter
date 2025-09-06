package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Location {
    private int locationX;
    private int locationY;
    private String direction;
    private final List<String> directions = Arrays.asList("N", "E", "S", "W");
    Location(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }
    public int getLocationX() {
        return locationX;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String respondLocation(){
        return this.locationX+":"+this.locationY+":"+this.direction;
    }
    public void increaseLocationX(){
        this.locationX++;
    }
    public void increaseLocationY(){
        this.locationY++;
    }
    public void decreaseLocationX(){
        this.locationX--;
    }
    public void decreaseLocationY(){
        this.locationY--;
    }
    public void turnLeft(){
        this.direction = directions.get((directions.indexOf(this.direction)-1+4)%directions.size());
    }
    public void turnRight(){
        this.direction = directions.get((directions.indexOf(this.direction)+1)%directions.size());
    }
}
