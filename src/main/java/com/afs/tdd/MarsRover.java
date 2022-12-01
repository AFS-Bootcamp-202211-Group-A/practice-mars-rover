package com.afs.tdd;

public class MarsRover {

    public static final String N = "N";
    public static final String S = "S";
    public static final String E = "E";
    public static final String W = "W";
    public static final String M = "M";
    public static final String L = "L";
    public static final String R = "R";
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeCommand(String command) {
        switch (command) {
            case M:
                move();
                break;
            case L:
                turnLeft();
                break;
            case R:
                turnRight();
                break;
        }
    }

    private void turnRight() {
        switch (direction) {
            case N:
                direction = E;
                break;
            case S:
                direction = W;
                break;
            case E:
                direction = S;
                break;
            case W:
                direction = N;
                break;
        }

    }

    private void turnLeft() {
        switch (direction) {
            case N:
                direction = W;
                break;
            case S:
                direction = E;
                break;
            case E:
                direction = N;
                break;
            case W:
                direction = S;
                break;
        }
    }

    private void move() {
        switch (direction) {
            case N:
                locationY++;
                break;
            case S:
                locationY--;
                break;
            case E:
                locationX++;
                break;
            case W:
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
