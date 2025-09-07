package com.afs.tdd;

public class TurnLeftCommand implements Command {
    private final MarRover rover;
    
    public TurnLeftCommand(MarRover rover) {
        this.rover = rover;
    }
    
    @Override
    public void execute() {
        rover.turnLeft();
    }
}
