package com.afs.tdd;

import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class MarsRover {

    static List<String> directions = Arrays.asList("N", "E", "S", "W");

    public Position executeBatchCommand(Position position, String batchCommand) {
        return null;
    }

    public Position executeCommand(Position position, String command) {

        if (command == "M") {
            return move(position);
        } else if (command == "R") {
            return turnRight(position);
        }
        return null;
    }

    private Position turnRight(Position position) {
        position.setDirection(directions.get((directions.indexOf(position.getDirection()) + 1) % 4));
        return position;
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
