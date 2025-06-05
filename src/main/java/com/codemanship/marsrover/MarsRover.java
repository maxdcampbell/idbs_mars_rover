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

        final Pattern pattern = Pattern.compile("[0-9],[0-9],[A-Z]");
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

    public String getCurrentDirection() {
        return this.direction;
    }

    public void turnRight() {
        switch (this.direction) {
            case "North":
                direction = "East";
                break;
            case "East":
                direction = "South";
                break;
            case "South":
                direction = "West";
                break;
            case "West":
                direction = "North";
                break;
        }
    }

    public String getRoverInformation() {
        return String.format("The rover is at (%d,%d) facing %s", this.xPos, this.yPos, this.direction);
    }

    public void runCommand(String cmd) {
        for (int i = 0; i < cmd.length(); i++) {
            char command = cmd.charAt(i);

            switch(command) {
                case 'R':
                    turnRight();
                    break;
                case 'Q':
                    System.out.println(getRoverInformation());
                    break;
            }

        }
    }
}
