package edu.bsu.cs222;

public class IntegerToRoman {
    public Boolean inputManager(int numInput) {
        if ((numInput <= 3000) && (numInput >= 1)) {
            return true;
        }
        return false;
    }

    public String intToRomanI(int numInput) {
        String romanNumeral = "";
        while(numInput >= 1){
            romanNumeral += "I";
            numInput -= 1;
        }
        return romanNumeral;
    }
}
