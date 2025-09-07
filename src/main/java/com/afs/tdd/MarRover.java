package com.afs.tdd;
import java.util.Objects;

public class MarRover {
    private final Location location;

    MarRover(Location location) {
        this.location = location;
    }

    public String executeCommand(String command) {
        command.chars()
                .mapToObj(c -> CommandType.fromChar((char) c))
                .filter(Objects::nonNull)
                .map(commandType -> commandType.createCommand(this))
                .forEach(Command::execute);
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
}
