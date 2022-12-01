package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverTest {
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


}
