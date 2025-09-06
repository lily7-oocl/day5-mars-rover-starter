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
            case "N":
                location.increaseLocationY();
                break;
            case "E":
                location.increaseLocationX();
                break;
            case "S":
                location.decreaseLocationY();
                break;
            case "W":
                location.decreaseLocationX();
                break;
        }
    }

    public void back() {
        switch (location.getDirection()) {
            case "N":
                location.decreaseLocationY();
                break;
            case "E":
                location.decreaseLocationX();
                break;
            case "S":
                location.increaseLocationY();
                break;
            case "W":
                location.increaseLocationX();
                break;
        }
    }

    public void turnLeft() {
        location.turnLeft();
    }

    public void turnRight() {
        location.turnRight();
    }

    public Location getLocation() {
        return location;
    }
}
