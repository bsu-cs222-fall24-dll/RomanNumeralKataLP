package edu.bsu.cs222;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InputManagerTest {
    @Test
    public void inputManagerTest(){
        IntegerToRoman manager = new IntegerToRoman();
        boolean testResult = manager.inputManager(300);
        assertTrue(testResult,"Input was less than or equal to 3,000.");
    }

    @Test
    //Tests the smallest basic inputs between 1 and 3.
    public void intToRomanTestStage1(){
        int testNumber = 3;
        String expected = "III";

        IntegerToRoman converter = new IntegerToRoman();
        String testResult = converter.intToRomanI(testNumber);
        assertEquals(expected, testResult);
    }
}