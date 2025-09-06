package com.afs.tdd;

public class Location {
    private int locationX;
    private int locationY;
    private Direction direction;
    Location(int locationX, int locationY, Direction direction) {
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

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public String respondLocation(){
        return this.locationX+":"+this.locationY+":"+this.direction.getDirection();
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
}
