package edu.bsu.cs222;

public class IntegerToRoman {
    public Boolean inputManager(int numInput) {
        if ((numInput <= 3000) && (numInput >= 1)) {
            return true;
        }
        return false;
    }

    public String intToRomanL(int numInput){
        String romanNumeral = "";
        while(numInput >= 50){
            romanNumeral += "L";
            numInput -= 50;
        }
        return romanNumeral;
    }
    public String intToRomanX(int numInput){
        String romanNumeral = "";
        while(numInput >= 10){
            romanNumeral += "X";
            numInput -= 10;
        }
        return romanNumeral;
    }

    public String intToRomanV(int numInput){
        String romanNumeral = "";
        while(numInput >= 5){
            romanNumeral += "V";
            numInput -= 5;
        }
        return romanNumeral;
    }

    public String intToRomanI(int numInput) {
        String romanNumeral = "";
        if(numInput == 9){
            romanNumeral += "IX";
            numInput -= 9;
        }
        else if(numInput == 4){
            romanNumeral += "IV";
            numInput -= 4;
        }
        while(numInput >= 1){
            romanNumeral += "I";
            numInput -= 1;
        }
        return romanNumeral;
    }
}
