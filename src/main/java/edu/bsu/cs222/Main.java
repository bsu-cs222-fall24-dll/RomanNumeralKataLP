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
        else {
            while(userInput > 0) {
                if(userInput >= 1000) {
                    romanNumeral += inputConverter.intToRomanM(userInput);
                    userInput -= 1000;
                }
                else if(userInput >=500) {
                    romanNumeral += inputConverter.intToRomanD(userInput);
                    userInput -= 500;
                }
                else if(userInput >= 100) {
                    romanNumeral += inputConverter.intToRomanC(userInput);
                    userInput -= 100;
                }
                else if(userInput >= 50) {
                    romanNumeral += inputConverter.intToRomanL(userInput);
                    userInput -= 50;
                }
                else if(userInput >= 10){
                    romanNumeral += inputConverter.intToRomanX(userInput);
                    userInput -= 10;
                }
                else if (userInput >= 5){
                    romanNumeral += inputConverter.intToRomanV(userInput);
                    userInput -= 5;
                }
                else if (userInput >= 1){
                    romanNumeral += inputConverter.intToRomanI(userInput);
                    userInput -= 1;
                }
            }
            System.out.println(romanNumeral);
        }
    }
}
