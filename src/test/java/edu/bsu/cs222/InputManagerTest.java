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
        int testNumber = 9;
        String expected = "IX";

        IntegerToRoman converter = new IntegerToRoman();
        String testResult = converter.intToRomanI(testNumber);
        assertEquals(expected, testResult);
    }

    @Test
    //Tests inputs that convert to the Roman numeral 'V'.
    public void intToRomanTestStage2(){
        int testNumber = 5;
        String expected = "V";

        IntegerToRoman converter = new IntegerToRoman();
        String testResult = converter.intToRomanV(testNumber);
        assertEquals(expected, testResult);
    }

    @Test
    //Tests inputs that convert to the Roman numeral 'X'.
    public void intToRomanTestStage3(){
        int testNumber = 20;
        String expected = "XX";

        IntegerToRoman converter = new IntegerToRoman();
        String testResult = converter.intToRomanX(testNumber);
        assertEquals(expected, testResult);
    }

    @Test
    //Tests inputs that convert to the Roman numeral 'L'.
    public void intToRomanTestStage4(){
        int testNumber = 50;
        String expected = "L";

        IntegerToRoman converter = new IntegerToRoman();
        String testResult = converter.intToRomanL(testNumber);
        assertEquals(expected, testResult);
    }
}