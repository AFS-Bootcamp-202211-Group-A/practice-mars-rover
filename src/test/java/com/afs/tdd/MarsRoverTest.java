package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    // 0 0 N M -> 0 1 N
    void should_go_to_0_1_N_when_execute_command_given_0_0_N_M() {
        MarsRover marsRover = new MarsRover(0,0,"N");
        marsRover.executeCommand("M");
        assertEquals(0,marsRover.getLocationX());
        assertEquals(1,marsRover.getLocationY());
        assertEquals("N",marsRover.getDirection());
    }
}
