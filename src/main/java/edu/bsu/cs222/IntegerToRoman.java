package edu.bsu.cs222;

import java.util.Scanner;

public class IntegerToRoman {
    public Boolean inputManager(int numInput) {
        if ((numInput <= 3000) && (numInput >= 1)) {
            return true;
        }
        return false;
    }

    public String intToRoman(int numInput){
        StringBuilder romanNum = new StringBuilder();
        while (numInput >= 1000){
            romanNum.append("M");
            numInput -= 1000;
        }
        while (numInput >= 500){
            romanNum.append("D");
            numInput -= 500;
        }
        while (numInput >= 100){
            romanNum.append("C");
            numInput -= 100;
        }
        while (numInput >= 50){
            romanNum.append("L");
            numInput -= 50;
        }
        while (numInput >= 10){
            romanNum.append("X");
            numInput -= 10;
        }
        while (numInput == 9){
            romanNum.append("IX");
            numInput -= 9;
        }
        while (numInput >= 5){
            romanNum.append("V");
            numInput -= 5;
        }
        while (numInput == 4){
            romanNum.append("IV");
            numInput -= 4;
        }
        while (numInput >= 1){
            romanNum.append("I");
            numInput -= 1;
        }
        return romanNum.toString();
    }
}