package com.codemanship.marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        Given: 1,2,S
        Then: The rover has been dropped at coordinates (1,2) facing South
         */
        MarsRover marsRover = new MarsRover();
        assertEquals(initialResponse, marsRover.initialise("1,2,S"));
    }

    @Test
    void initialisation_requires_correct_format() {
        MarsRover marsRover = new MarsRover();

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> marsRover.initialise("W,1,2"),
                "Expected initialise() to throw, but it didn't"
        );

        assertTrue(thrown.getMessage().contains("Invalid initialisation string"));
    }

    @Test
    void can_display_rover_information() {
        MarsRover marsRover = new MarsRover();
        marsRover.initialise("1,2,S");
        assertEquals("The rover is at (1,2) facing South", marsRover.getRoverInformation());
    }

    @Test
    void can_turn_right() {
        MarsRover marsRover = new MarsRover();
        marsRover.initialise("1,2,E");
        marsRover.turnRight();
        assertEquals("South", marsRover.getCurrentDirection());
    }

    @Test
    void can_run_basic_command() {
        MarsRover marsRover = new MarsRover();
        marsRover.initialise("1,2,E");
        marsRover.runCommand("R");
        assertEquals("South", marsRover.getCurrentDirection());
    }

    @Test
    void can_run_set_of_commands() {
        MarsRover marsRover = new MarsRover();
        marsRover.initialise("1,2,E");
        marsRover.runCommand("RRRR");
        assertEquals("East", marsRover.getCurrentDirection());
    }
}
