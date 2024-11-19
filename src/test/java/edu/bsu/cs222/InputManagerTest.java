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
    //Tests the smallest basic inputs between 1 and 3.
    public void intToRomanTestStage1(){
        int testNumber = 3;
        String expected = "III";

        InputManager converter = new InputManager();
        String testResult = converter.intToRomanI(testNumber);
        assertEquals(expected, testResult);
    }

    @Test
    //Tests small integer inputs that use the Roman numeral 'V' (4 to 8).
    public void intToRomanTestStage2(){
        int testNumber = 8;
        String expected = "VIII";

        InputManager converter = new InputManager();
        String testResult = converter.intToRomanV(testNumber);
        assertEquals(expected,testResult);
    }
}