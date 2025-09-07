package com.afs.tdd;

public class BackCommand implements Command {
    private final MarRover rover;

    public BackCommand(MarRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.back();
    }
}
