package com.afs.tdd;

public class MarRover {
    private final Location location;

    MarRover(Location location) {
        this.location = location;
    }

    public String executeCommand(String command) {
        for (Character singleCommand:command.toCharArray()){
            switch (singleCommand) {
                case 'M':
                    move();
                    break;
                case 'B':
                    back();
                    break;
                case 'R':
                    turnRight();
                    break;
                case 'L':
                    turnLeft();
                    break;
            }
        }
        return location.respondLocation();
    }

    public void move() {
        switch (location.getDirection()) {
            case NORTH:
                location.increaseLocationY();
                break;
            case EAST:
                location.increaseLocationX();
                break;
            case SOUTH:
                location.decreaseLocationY();
                break;
            case WEST:
                location.decreaseLocationX();
                break;
        }
    }

    public void back() {
        switch (location.getDirection()) {
            case NORTH:
                location.decreaseLocationY();
                break;
            case EAST:
                location.decreaseLocationX();
                break;
            case SOUTH:
                location.increaseLocationY();
                break;
            case WEST:
                location.increaseLocationX();
                break;
        }
    }

    public void turnLeft() {
        location.setDirection(location.getDirection().turnLeft());
    }

    public void turnRight() {
        location.setDirection(location.getDirection().turnRight());
    }

    public Location getLocation() {
        return location;
    }
}
