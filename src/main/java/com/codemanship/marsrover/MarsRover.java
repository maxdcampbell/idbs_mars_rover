package com.codemanship.marsrover;

import java.util.regex.Pattern;

public class MarsRover {
    private int xPos;
    private int yPos;
    private String direction;


    public MarsRover() {}

    /**
     * Initialisation of Mars Rover
     * @param input String of the form "5,6,N"
     * @return initialisation
     */
    public String initialise(String input) {

        final Pattern pattern = Pattern.compile("[0-9],[0-9],[A-Za-z]");
        if (!pattern.matcher(input).matches()) {
            throw new IllegalArgumentException("Invalid initialisation string. Needs to be in the format 'x,y,{direction} eg. '1,2,N'");
        }
        String[] commands = input.split(",");
        xPos = Integer.parseInt(commands[0]);
        yPos = Integer.parseInt(commands[1]);
        direction = getDirection(commands[2]);

        return String.format("The rover has been dropped at coordinates (%d,%d) facing %s", xPos, yPos, direction);
    }

    private String getDirection(String direction) {
        switch (direction) {
            case "N":
                return "North";
            case "S":
                return "South";
            case "E":
                return "East";
            case "W" :
                return "West";
            default:
                return "invalid direction";
        }
    }
}
