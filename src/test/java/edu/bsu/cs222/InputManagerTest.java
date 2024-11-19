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
    //Tests inputs that convert to the Roman numeral 'I'.
    public void intToRomanTestStage1(){
        int testNumber = 3;
        String expected = "III";

        IntegerToRoman converter = new IntegerToRoman();
        String testResult = converter.intToRomanI(testNumber);
        assertEquals(expected, testResult);
    }

    @Test
    public void intToRomanTestStage2(){
        int testNumber = 5;
        String expected = "V";

        IntegerToRoman converter = new IntegerToRoman();
        String testResult = converter.intToRomanV(testNumber);
        assertEquals(expected, testResult);
    }
}