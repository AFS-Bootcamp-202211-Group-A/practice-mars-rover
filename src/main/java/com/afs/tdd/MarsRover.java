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
            case "L":
                turnLeft();
                break;
            default:
        }
    }

    public void executeBatchCommands(String batchCommand){
        batchCommand
                .chars()
                .mapToObj(command -> (char)command)
                .map( command ->  String.valueOf(command))
                .forEach(command -> executeCommand(command));
    }

    private void turnRight(){
        switch (direction){
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
            default:

        }
    }

    private void turnLeft(){
        switch (direction){
            case "N":
                direction = "W";
                break;
            case "W":
                direction = "S";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
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
