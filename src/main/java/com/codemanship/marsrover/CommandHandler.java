package com.codemanship.marsrover;

import java.util.ArrayList;
import java.util.List;

public class CommandHandler {


    public CommandHandler() {
    }

    public List<Command> processInput(String input) {
        List<Command> commands = new ArrayList<>();
        for (String command: input.split("")) {
            if ("Q".equals(command)) {
                commands.add(Command.Q);
            }
        }

        return commands;
    }
}
