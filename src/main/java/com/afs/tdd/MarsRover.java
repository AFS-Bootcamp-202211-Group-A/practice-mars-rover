package com.afs.tdd;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;
    public MarsRover(int locationX, int locationY  , String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeCommand(String command) {
        switch (command) {
            case "M":
                this.move();
                break;
            case "R":
                turnRight();
                break;
            default:
        }
    }

    private void turnRight(){
        switch (direction){
            case "N":
                direction = "E";
            default:

        }
    }

    private void move() {
        switch (direction){
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
            default:
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
