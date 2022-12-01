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

    @Test
    void should_0_0_S_when_R_given_0_0_E() {
        //given
        MarsRover rover = new MarsRover(0,0, "E");

        //when
        rover.executeCommand("R");

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("S", rover.getDirection());
    }

    @Test
    void should_0_0_W_when_R_given_0_0_S() {
        //given
        MarsRover rover = new MarsRover(0,0, "S");

        //when
        rover.executeCommand("R");

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("W", rover.getDirection());
    }

    @Test
    void should_0_0_N_when_R_given_0_0_W() {
        //given
        MarsRover rover = new MarsRover(0,0, "E");

        //when
        rover.executeCommand("R");

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("S", rover.getDirection());
    }

    @Test
    void should_0_0_W_when_L_given_0_0_N() {
        //given
        MarsRover rover = new MarsRover(0,0, "N");

        //when
        rover.executeCommand("L");

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("W", rover.getDirection());
    }

    @Test
    void should_0_0_S_when_L_given_0_0_W() {
        //given
        MarsRover rover = new MarsRover(0,0, "W");

        //when
        rover.executeCommand("L");

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("S", rover.getDirection());
    }

    @Test
    void should_0_0_E_when_L_given_0_0_S() {
        //given
        MarsRover rover = new MarsRover(0,0, "S");

        //when
        rover.executeCommand("L");

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("E", rover.getDirection());
    }

    @Test
    void should_0_0_N_when_L_given_0_0_E() {
        //given
        MarsRover rover = new MarsRover(0,0, "E");

        //when
        rover.executeCommand("L");

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("N", rover.getDirection());
    }

    @Test
    void should_0_1_N_when_M_given_0_0_N() {
        //given
        MarsRover rover = new MarsRover(0,0, "N");

        //when
        rover.executeCommand("M");

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(1, rover.getLocationY());
        assertEquals("N", rover.getDirection());
    }

    @Test
    void should_1_0_E_when_M_given_0_0_E() {
        //given
        MarsRover rover = new MarsRover(0,0, "E");

        //when
        rover.executeCommand("M");

        //then
        assertEquals(1, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("E", rover.getDirection());
    }

    @Test
    void should_0_0_S_when_M_given_0_1_S() {
        //given
        MarsRover rover = new MarsRover(0,1, "S");

        //when
        rover.executeCommand("M");

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("S", rover.getDirection());
    }


}
