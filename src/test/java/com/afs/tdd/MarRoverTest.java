package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarRoverTest {
    @Test
    public void should_move_when_executeCommand_given_M_and_direction_is_N() {
        Location ExpectedLocation = new Location(0,1,Direction.NORTH);
        //Given
        Location location = new Location(0,0,Direction.NORTH);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("M");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
    @Test
    public void should_move_when_executeCommand_given_M_and_direction_is_E() {
        Location ExpectedLocation = new Location(1,0,Direction.EAST);
        //Given
        Location location = new Location(0,0,Direction.EAST);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("M");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
    @Test
    public void should_move_when_executeCommand_given_M_and_direction_is_S() {
        Location ExpectedLocation = new Location(0,-1,Direction.SOUTH);
        //Given
        Location location = new Location(0,0,Direction.SOUTH);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("M");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
    @Test
    public void should_move_when_executeCommand_given_M_and_direction_is_W() {
        Location ExpectedLocation = new Location(-1,0,Direction.WEST);
        //Given
        Location location = new Location(0,0,Direction.WEST);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("M");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
    @Test
    public void should_move_when_executeCommand_given_B_and_direction_is_N() {
        Location ExpectedLocation = new Location(0,-1,Direction.NORTH);
        //Given
        Location location = new Location(0,0,Direction.NORTH);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("B");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
    @Test
    public void should_move_when_executeCommand_given_B_and_direction_is_E() {
        Location ExpectedLocation = new Location(-1,0,Direction.EAST);
        //Given
        Location location = new Location(0,0,Direction.EAST);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("B");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
    @Test
    public void should_move_when_executeCommand_given_B_and_direction_is_S() {
        Location ExpectedLocation = new Location(0,1,Direction.SOUTH);
        //Given
        Location location = new Location(0,0,Direction.SOUTH);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("B");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
    @Test
    public void should_move_when_executeCommand_given_B_and_direction_is_W() {
        Location ExpectedLocation = new Location(1,0,Direction.WEST);
        //Given
        Location location = new Location(0,0,Direction.WEST);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("B");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
    @Test
    public void should_move_when_executeCommand_given_L_and_direction_is_N() {
        Location ExpectedLocation = new Location(0,0,Direction.WEST);
        //Given
        Location location = new Location(0,0,Direction.NORTH);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("L");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
    @Test
    public void should_move_when_executeCommand_given_L_and_direction_is_W() {
        Location ExpectedLocation = new Location(0,0,Direction.SOUTH);
        //Given
        Location location = new Location(0,0,Direction.WEST);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("L");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
    @Test
    public void should_move_when_executeCommand_given_L_and_direction_is_S() {
        Location ExpectedLocation = new Location(0,0,Direction.EAST);
        //Given
        Location location = new Location(0,0,Direction.SOUTH);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("L");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
    @Test
    public void should_move_when_executeCommand_given_L_and_direction_is_E() {
        Location ExpectedLocation = new Location(0,0,Direction.NORTH);
        //Given
        Location location = new Location(0,0,Direction.EAST);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("L");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
    @Test
    public void should_move_when_executeCommand_given_R_and_direction_is_N() {
        Location ExpectedLocation = new Location(0,0,Direction.EAST);
        //Given
        Location location = new Location(0,0,Direction.NORTH);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("R");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
    @Test
    public void should_move_when_executeCommand_given_R_and_direction_is_E() {
        Location ExpectedLocation = new Location(0,0,Direction.SOUTH);
        //Given
        Location location = new Location(0,0,Direction.EAST);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("R");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
    @Test
    public void should_move_when_executeCommand_given_R_and_direction_is_S() {
        Location ExpectedLocation = new Location(0,0,Direction.WEST);
        //Given
        Location location = new Location(0,0,Direction.SOUTH);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("R");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
    @Test
    public void should_move_when_executeCommand_given_R_and_direction_is_W() {
        Location ExpectedLocation = new Location(0,0,Direction.NORTH);
        //Given
        Location location = new Location(0,0,Direction.WEST);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("R");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
    @Test
    public  void should_execute_multiple_command_when_given_MBLR_and_direction_is_N(){
        Location ExpectedLocation = new Location(0,0,Direction.NORTH);
        //Given
        Location location = new Location(0,0,Direction.NORTH);
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("MBLR");
        //Then
        assertEquals(ExpectedLocation.respondLocation(),currentLocation);
    }
}
