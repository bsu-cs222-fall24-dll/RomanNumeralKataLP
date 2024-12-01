package edu.bsu.cs222;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InputManagerTest {
    @Test
    public void inputManagerTest(){
        IntegerToRoman manager = new IntegerToRoman();
        boolean testResult = manager.inputManager(3000);
        assertTrue(testResult,"Input was less than 1 or greater than 3,000.");
    }

    @Test
    public void intToRomanTest(){
        IntegerToRoman conversion = new IntegerToRoman();
        String testResult = conversion.intToRoman(1509);
        assertEquals("MDIX",testResult);
    }
}