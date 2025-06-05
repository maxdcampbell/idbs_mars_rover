package com.codemanship.marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CommandHandlerTest {
    @Test
    void canHandleQInput() {
        CommandHandler commandHandler = new CommandHandler();
        assertEquals("Q", commandHandler.processInput("Q").get(0).name());
    }


}
