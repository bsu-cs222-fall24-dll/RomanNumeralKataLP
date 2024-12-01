package edu.bsu.cs222;

import java.util.Scanner;

public class IntegerToRoman {
    public Boolean inputManager(int numInput) {
        if ((numInput <= 3000) && (numInput >= 1)) {
            return true;
        }
        return false;
    }
}