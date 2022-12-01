package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    void should_0_0_E_when_R_given_0_0_N() {
        //given
        MarsRover rover = new MarsRover(0,0, "N");
        
        //when
        rover.executeCommand("R");

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("E", rover.getDirection());
    }



}
