package com.afs.tdd;

public enum Direction {
    NORTH("N"), EAST("E"), SOUTH("S"), WEST("W");

    private final String direction;
    Direction(String direction){
        this.direction = direction;
    }
    public Direction turnLeft() {
        return values()[(ordinal() + 3) % 4];
    }

    public Direction turnRight() {
        return values()[(ordinal() + 1) % 4];
    }

    public String getDirection() {
        return direction;
    }
}
