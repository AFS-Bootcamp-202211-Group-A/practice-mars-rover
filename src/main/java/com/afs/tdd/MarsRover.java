package com.afs.tdd;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;
    private List<String> directions = new ArrayList<>(Arrays.asList ("N","E","S","W"));


    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeCommand(String command) {
        if(command.equals("M")){
            move();
        } else if (command.equals("L")) {
            turnLeft();
        } else if (command.equals("R")) {
            turnRight();
        }
    }

    private void turnRight() {
        int index=directions.indexOf(direction);
        direction = directions.get((index+ directions.size()+1)%directions.size());

    }

    private void turnLeft() {
        int index=directions.indexOf(direction);
        direction = directions.get((index+ directions.size()-1)%directions.size());
    }

    private void move() {
        switch (direction) {
            case "N":
                locationY++;
                break;
            case "E":
                locationX++;
                break;
            case "S":
                locationY--;
                break;
            case "W":
                locationX--;
                break;
        }
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getDirection() {
        return direction;
    }

}
