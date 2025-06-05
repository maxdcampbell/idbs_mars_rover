package com.codemanship.marsrover;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        MarsRover rover = new MarsRover();

        System.out.println("Enter target coordinates and direction:");
        String initilisationString = myObj.nextLine();
        String confirmation = rover.initialise(initilisationString);
        System.out.println(confirmation);
    }

}
