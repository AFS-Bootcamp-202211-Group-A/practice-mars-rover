package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;

public class MarsRover {

    private int locationX;
    private int locationY;
    private String direction;

    static final private ArrayList<String> directions = new ArrayList<>(Arrays.asList("N", "E", "S", "W", "N", "E", "S"));

    public MarsRover(int locationX, int locationY, String direction){
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
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

    private void turnRight(){
        this.direction = directions.get(directions.indexOf(this.direction) + 1);
    }

    private void turnLeft(){
        this.direction = directions.get(directions.indexOf(this.direction) + 3);
    }

    private void move(){
        switch (this.direction) {
            case "N":
                locationY += 1;
                break;
            case "E":
                locationX += 1;
                break;
            case "S":
                locationY -= 1;
                break;
            case "W":
                locationX -= 1;
                break;
        }
    }

    public void executeCommand(String commands) {

        for (String command : commands.split("")){
            switch (command) {
                case "R":
                    turnRight();
                    break;
                case "L":
                    turnLeft();
                    break;
                case "M":
                    move();
                    break;
            }
        }

    }
}
