package com.codemanship.marsrover;

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
