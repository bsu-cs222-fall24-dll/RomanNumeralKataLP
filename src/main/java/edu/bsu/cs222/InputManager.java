package edu.bsu.cs222;

//import java.util.String
public class InputManager {
    public Boolean inputManager(int numInput) {
        if ((numInput <= 3000) && (numInput >= 1)) {
            return true;
        }
        return false;
    }
    public String intToRomanI(int numInput){
       String romanNumeral = "";
        if (numInput <= 3){
            for (int i = 0; i <= numInput - 1; i++){
                romanNumeral += "I";
            }
        }
        return romanNumeral;
    }

    public String intToRomanV(int numInput){
        String romanNumeral = "";
        if ((numInput >= 4) && (numInput <= 8)) {
            if (numInput == 5) {
                romanNumeral += "V";
            }
            else {
                if (numInput == 4){
                    romanNumeral += "IV";
                }
                else{
                    romanNumeral += "V";
                    for (int i = 5; i <= numInput - 1; i++){
                        romanNumeral += "I";
                    }
                }
            }
        }
        return romanNumeral;
    }
}
