package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;

public class MarsRover {

    int locationX;
    int locationY;
    String direction;

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

    public void turnRight(){
        ArrayList<String> directions = new ArrayList<>(Arrays.asList("N", "E", "S", "W", "N"));
        this.direction = directions.get(directions.indexOf(this.direction) + 1);
    }

    public void executeCommand(String m) {
        if (m.equals("R")){
            turnRight();
        }

    }
}
