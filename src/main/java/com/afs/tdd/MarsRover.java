package com.afs.tdd;

public class MarsRover {

    public static final String N = "N";
    public static final String S = "S";
    public static final String E = "E";
    public static final String W = "W";
    public static final String M = "M";
    public static final String L = "L";
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }
    public void executeCommand(String command){
        if (command.equals(M)){
            move();
        }else if(command.equals(L)){
            turnLeft();
        } else if (command.equals("R")) {
            turnRight();

        }
    }

    private void turnRight() {
        if (direction.equals(N)){
            direction = E;
        }else if (direction.equals(S)) {
            direction = W;

        }else if (direction.equals(E)) {
            direction = S;

        }else if (direction.equals(W)) {
            direction = N;

        }
    }

    private void turnLeft() {
        if (direction.equals(N)){
            direction = W;
        } else if (direction.equals(S)) {
            direction = E;

        }else if (direction.equals(E)) {
            direction = N;

        }else if (direction.equals(W)) {
            direction = S;

        }
    }

    private void move() {
        if (direction.equals(N)){
            locationY++;
        } else if (direction.equals(S)){
            locationY--;
        }else if (direction.equals(E)){
            locationX++;
        }else if (direction.equals(W)){
            locationX--;
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
