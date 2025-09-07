package com.afs.tdd;

import java.util.function.Function;

public enum CommandType {
    MOVE('M', MoveCommand::new),
    BACK('B', BackCommand::new),
    TURN_RIGHT('R', TurnRightCommand::new),
    TURN_LEFT('L', TurnLeftCommand::new);

    private final char commandChar;
    private final Function<MarRover, Command> commandFactory;

    CommandType(char commandChar, Function<MarRover, Command> commandFactory) {
        this.commandChar = commandChar;
        this.commandFactory = commandFactory;
    }

    public Command createCommand(MarRover rover) {
        return commandFactory.apply(rover);
    }

    public static CommandType fromChar(char c) {
        for (CommandType command : values()) {
            if (command.commandChar == c) {
                return command;
            }
        }
        return null;
    }
}
