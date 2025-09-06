package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarRoverTest {
    @Test
    public void should_move_when_executeCommand_given_M_and_direction_is_N() {
        Location ExpectedLocation = new Location(0,1,"N");
        //Given
        Location location = new Location(0,0,"N");
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("M");
        //Then
        assertEquals(currentLocation,ExpectedLocation.respondLocation());
    }
    @Test
    public void should_move_when_executeCommand_given_M_and_direction_is_E() {
        Location ExpectedLocation = new Location(1,0,"E");
        //Given
        Location location = new Location(0,0,"E");
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("M");
        //Then
        assertEquals(currentLocation,ExpectedLocation.respondLocation());out
    }
    @Test
    public void should_move_when_executeCommand_given_M_and_direction_is_S() {
        Location ExpectedLocation = new Location(0,-1,"S");
        //Given
        Location location = new Location(0,0,"S");
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("M");
        //Then
        assertEquals(currentLocation,ExpectedLocation.respondLocation());
    }
    @Test
    public void should_move_when_executeCommand_given_M_and_direction_is_W() {
        Location ExpectedLocation = new Location(-1,0,"W");
        //Given
        Location location = new Location(0,0,"W");
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("M");
        //Then
        assertEquals(currentLocation,ExpectedLocation.respondLocation());
    }
    @Test
    public void should_move_when_executeCommand_given_L_and_direction_is_N() {
        Location ExpectedLocation = new Location(0,0,"W");
        //Given
        Location location = new Location(0,0,"N");
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("M");
        //Then
        assertEquals(currentLocation,ExpectedLocation.respondLocation());
    }
    @Test
    public void should_move_when_executeCommand_given_L_and_direction_is_W() {
        Location ExpectedLocation = new Location(0,0,"S");
        //Given
        Location location = new Location(0,0,"W");
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("M");
        //Then
        assertEquals(currentLocation,ExpectedLocation.respondLocation());
    }
    @Test
    public void should_move_when_executeCommand_given_L_and_direction_is_S() {
        Location ExpectedLocation = new Location(0,0,"E");
        //Given
        Location location = new Location(0,0,"S");
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("M");
        //Then
        assertEquals(currentLocation,ExpectedLocation.respondLocation());
    }
    @Test
    public void should_move_when_executeCommand_given_L_and_direction_is_E() {
        Location ExpectedLocation = new Location(0,0,"N");
        //Given
        Location location = new Location(0,0,"E");
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("M");
        //Then
        assertEquals(currentLocation,ExpectedLocation.respondLocation());
    }
    @Test
    public void should_move_when_executeCommand_given_R_and_direction_is_N() {
        Location ExpectedLocation = new Location(0,0,"E");
        //Given
        Location location = new Location(0,0,"N");
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("M");
        //Then
        assertEquals(currentLocation,ExpectedLocation.respondLocation());
    }
    @Test
    public void should_move_when_executeCommand_given_R_and_direction_is_E() {
        Location ExpectedLocation = new Location(0,0,"S");
        //Given
        Location location = new Location(0,0,"E");
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("M");
        //Then
        assertEquals(currentLocation,ExpectedLocation.respondLocation());
    }
    @Test
    public void should_move_when_executeCommand_given_R_and_direction_is_S() {
        Location ExpectedLocation = new Location(0,0,"W");
        //Given
        Location location = new Location(0,0,"S");
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("M");
        //Then
        assertEquals(currentLocation,ExpectedLocation.respondLocation());
    }
    @Test
    public void should_move_when_executeCommand_given_R_and_direction_is_W() {
        Location ExpectedLocation = new Location(0,0,"N");
        //Given
        Location location = new Location(0,0,"W");
        MarRover marRover = new MarRover(location);
        //When
        String currentLocation = marRover.executeCommand("M");
        //Then
        assertEquals(currentLocation,ExpectedLocation.respondLocation());
    }
}
