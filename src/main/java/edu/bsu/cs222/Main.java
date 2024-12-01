package edu.bsu.cs222;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerToRoman inputConverter = new IntegerToRoman();
        String romanNumeral = "";

        System.out.println("Enter a number between 1 and 3,000: ");
        int userInput = scanner.nextInt();

        if(!inputConverter.inputManager(userInput)){
            System.out.println("Number inputted was less than 1 or greater than 3,000. Please try again.\n");
        }
    }
}
