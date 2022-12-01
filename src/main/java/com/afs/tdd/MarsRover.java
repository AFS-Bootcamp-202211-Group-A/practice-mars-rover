package com.afs.tdd;

import javafx.geometry.Pos;

import java.util.Arrays;
import java.util.HashMap;

public class MarsRover {

    public Position executeBatchCommand(Position position, String batchCommand){
        return null;
    }

    public Position executeCommand(Position position, String command) {

        if (command == "M") {
            return move(position);
        }
        else{

        }
        return null;
    }

    private Position move(Position position) {
        String direction = position.getDirection();
        if (direction == "N" || direction == "S") {
            position.setY(direction.equals("N") ? position.getY() + 1 : position.getY() - 1);
        } else if (direction == "E" || direction == "W") {
            position.setX(direction.equals("E") ? position.getX() + 1 : position.getX() - 1);
        }
        return position;
    }

}
