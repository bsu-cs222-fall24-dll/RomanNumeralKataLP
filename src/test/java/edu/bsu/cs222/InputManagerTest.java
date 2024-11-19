package edu.bsu.cs222;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InputManagerTest {
    @Test
    public void inputManagerTest(){
        InputManager manager = new InputManager();
        boolean testResult = manager.inputManager(300);
        assertTrue(testResult,"Input was less than or equal to 3,000.");
    }

    @Test
    public void intToRomanTest(){
        int testNumber = 3;
        String expected = "III";

        InputManager converter = new InputManager();
        String testResult = converter.intToRoman(testNumber);
        assertEquals(expected, testResult);
    }
}