package com.afs.tdd;

public class MarRover {
    private final Location location;

    MarRover(Location location) {
        this.location = location;
    }

    public String executeCommand(String command) {

        switch (command) {
            case "M":
                move(command);
            break;
            case "B":
                back(command);
            case "R":
                turnRight(command);
                break;
            case "L":
                turnLeft(command);
                break;
        }
        return null;

    }

    public void move(String command) {
    }

    public void back(String command) {
    }

    public void turnLeft(String command) {
    }

    public void turnRight(String command) {
    }

    public Location getLocation() {
        return location;
    }
}
