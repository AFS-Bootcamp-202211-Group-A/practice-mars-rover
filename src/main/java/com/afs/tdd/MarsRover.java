package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;

public class MarsRover {

    int locationX;
    int locationY;
    String direction;

    static final ArrayList<String> directions = new ArrayList<>(Arrays.asList("N", "E", "S", "W", "N", "E", "S", "W"));

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
        this.direction = directions.get(directions.indexOf(this.direction) + 1);
    }

    public void turnLeft(){
        this.direction = directions.get(directions.indexOf(this.direction) + 3);
    }

    private void move(){
        if (this.direction.equals("N")){
            locationY += 1;
        } else if (this.direction.equals("E")){
            locationX += 1;
        }
    }

    public void executeCommand(String m) {
        if (m.equals("R")){
            turnRight();
        } else if (m.equals("L")){
            turnLeft();
        } else if (m.equals("M")){
            move();
        }

    }
}
