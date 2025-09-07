package com.afs.tdd;

public class TurnRightCommand implements Command {
    private final MarRover rover;
    
    public TurnRightCommand(MarRover rover) {
        this.rover = rover;
    }
    
    @Override
    public void execute() {
        rover.turnRight();
    }
}
