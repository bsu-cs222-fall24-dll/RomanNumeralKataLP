package edu.bsu.cs222;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InputManagerTest {
    @Test
    public void inputManagerTest(){
        InputManager manager = new InputManager();
        boolean testResult = manager.inputManager(3001);
        assertEquals(true,testResult);
    }
}