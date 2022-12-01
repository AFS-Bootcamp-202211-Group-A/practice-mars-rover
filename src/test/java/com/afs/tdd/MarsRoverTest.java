package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverTest{
    @Test
    public void givenPosition00NCommandM_whenExecuteCommand_thenReturn01N() {
        //given
        Position position = new Position(0, 0, "N");

        //when
        MarsRover car = new MarsRover();
        Position actual = car.executeCommand(position, "M");

        //then
        assertThat(actual).usingRecursiveComparison().isEqualTo(new Position(0, 1, "N"));
    }

    @Test
    public void givenPosition00ECommandM_whenExecuteCommand_thenReturn10E() {
        //given
        Position position = new Position(0, 0, "E");

        //when
        MarsRover car = new MarsRover();
        Position actual = car.executeCommand(position, "M");

        //then
        assertThat(actual).usingRecursiveComparison().isEqualTo(new Position(1, 0, "E"));
    }

    @Test
    public void givenPosition00SCommandM_whenExecuteCommand_thenReturn0Minus1S() {
        //given
        Position position = new Position(0, 0, "S");

        //when
        MarsRover car = new MarsRover();
        Position actual = car.executeCommand(position, "M");

        //then
        assertThat(actual).usingRecursiveComparison().isEqualTo(new Position(0, -1, "S"));
    }

    @Test
    public void givenPosition00WCommandM_whenExecuteCommand_thenReturnMinus10W() {
        //given
        Position position = new Position(0, 0, "W");

        //when
        MarsRover car = new MarsRover();
        Position actual = car.executeCommand(position, "M");

        //then
        assertThat(actual).usingRecursiveComparison().isEqualTo(new Position(-1, 0, "W"));
    }




}
