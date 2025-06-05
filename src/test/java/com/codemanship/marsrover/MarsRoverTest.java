package com.codemanship.marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    void can_initialise_mars_rover() {

        String initialResponse = "The rover has been dropped at coordinates (5,6) facing North";
        /*
        Given: 5,6,N
        Then: The rover has been dropped at coordinates (5,6) facing North
         */
        MarsRover marsRover = new MarsRover();
        assertEquals(initialResponse, marsRover.initialise("5,6,N"));
    }

}
