package com.afs.tdd;

public class MoveCommand implements Command {
    private final MarRover rover;
    
    public MoveCommand(MarRover rover) {
        this.rover = rover;
    }
    
    @Override
    public void execute() {
        rover.move();
    }
}
