package com.codemanship.marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    void can_initialise_mars_rover_to_56N() {

        String initialResponse = "The rover has been dropped at coordinates (5,6) facing North";
        /*
        Given: 5,6,N
        Then: The rover has been dropped at coordinates (5,6) facing North
         */
        MarsRover marsRover = new MarsRover();
        assertEquals(initialResponse, marsRover.initialise("5,6,N"));
    }

    @Test
    void can_initialise_mars_rover_to_12S() {

        String initialResponse = "The rover has been dropped at coordinates (1,2) facing South";
        /*
        Given: 5,6,N
        Then: The rover has been dropped at coordinates (5,6) facing North
         */
        MarsRover marsRover = new MarsRover();
        assertEquals(initialResponse, marsRover.initialise("1,2,S"));
    }

    @Test
    void can_display_rover_information() {
        MarsRover marsRover = new MarsRover();
        marsRover.initialise("1,2,S");
        assertEquals("The rover is at (1,2) facing South", marsRover.getRoverInformation());
    }
}
