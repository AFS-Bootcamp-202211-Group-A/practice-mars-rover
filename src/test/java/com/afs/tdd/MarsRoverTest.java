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
    @Test
        // 0 0 E M -> 1 0 E
    void should_go_to_1_0_E_when_execute_command_given_0_0_E_M() {
        MarsRover marsRover = new MarsRover(0,0,"E");
        marsRover.executeCommand("M");
        assertEquals(1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getDirection());
    }
    @Test
        // 0 0 S M -> 0 -1 S
    void should_go_to_0_neg1_S_when_execute_command_given_0_0_S_M() {
        MarsRover marsRover = new MarsRover(0,0,"S");
        marsRover.executeCommand("M");
        assertEquals(0,marsRover.getLocationX());
        assertEquals(-1,marsRover.getLocationY());
        assertEquals("S",marsRover.getDirection());
    }
    @Test
        // 0 0 W M -> -1 0 W
    void should_go_to_neg1_0_W_when_execute_command_given_0_0_W_M() {
        MarsRover marsRover = new MarsRover(0,0,"W");
        marsRover.executeCommand("M");
        assertEquals(-1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getDirection());
    }
    @Test
        // 0 0 N L -> 0 0 W
    void should_go_to_0_0_W_when_execute_command_given_0_0_N_L() {
        MarsRover marsRover = new MarsRover(0,0,"N");
        marsRover.executeCommand("L");
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getDirection());
    }
    @Test
        // 0 0 W L -> 0 0 S
    void should_go_to_0_0_S_when_execute_command_given_0_0_W_L() {
        MarsRover marsRover = new MarsRover(0,0,"W");
        marsRover.executeCommand("L");
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("S",marsRover.getDirection());
    }
    @Test
        // 0 0 S L -> 0 0 E
    void should_go_to_0_0_E_when_execute_command_given_0_0_S_L() {
        MarsRover marsRover = new MarsRover(0,0,"S");
        marsRover.executeCommand("L");
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getDirection());
    }
    @Test
        // 0 0 E L -> 0 0 N
    void should_go_to_0_0_N_when_execute_command_given_0_0_E_L() {
        MarsRover marsRover = new MarsRover(0,0,"E");
        marsRover.executeCommand("L");
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("N",marsRover.getDirection());
    }
    @Test
        // 0 0 N R -> 0 0 E
    void should_go_to_0_0_W_when_execute_command_given_0_0_N_R() {
        MarsRover marsRover = new MarsRover(0,0,"N");
        marsRover.executeCommand("R");
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getDirection());
    }
    @Test
        // 0 0 E R -> 0 0 S
    void should_go_to_0_0_S_when_execute_command_given_0_0_E_R() {
        MarsRover marsRover = new MarsRover(0,0,"E");
        marsRover.executeCommand("R");
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("S",marsRover.getDirection());
    }
    @Test
        // 0 0 S R -> 0 0 W
    void should_go_to_0_0_W_when_execute_command_given_0_0_S_R() {
        MarsRover marsRover = new MarsRover(0,0,"S");
        marsRover.executeCommand("R");
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getDirection());
    }
    @Test
        // 0 0 W R -> 0 0 N
    void should_go_to_0_0_N_when_execute_command_given_0_0_W_R() {
        MarsRover marsRover = new MarsRover(0,0,"W");
        marsRover.executeCommand("R");
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("N",marsRover.getDirection());
    }
}
