/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberguessinggame1;
import java.util.Scanner;

/**
 *
 * @author Sepiroth X
 * Description: Guessing Game for Java Beginners. A number will be generated randomly from 1~100
 * and the user has to guess which number it is.
 */
public class NumberGuessingGame1 {

    public static void main(String[] args) {
        // This is the part where we start our code . . . 
        
        /*Algorithm for solution:
        *
        * START
        *   Create variable that will store the random number
        *   Ask a number as user input
        *   Check if the number entered as input matched the random number
        *   End the game it match
        *   Give hint if the number is high or low if the entered number didn't match the random number
        * END
        */
        
        //prepare the variable that will store the random number
        int randomlyGeneratedNumber = (int)(Math.random() * 100 + 1);
        
        //prepare the variable that will catch or store the input number
        int userInput;
        
        //console will be our object of our Scanner class to process input data
        Scanner console = new Scanner(System.in);
        
        
        //prompt the user that the number has been generated
        System.out.println("Number has been generated! Have a guess!");
        
        
        do {
            
            System.out.println("Enter a number between 1~100 below: ");
            userInput = console.nextInt();
            
            if (userInput > randomlyGeneratedNumber) {
                System.out.println("Entered number is HIGHER than the generated number! Guess lower!");
            } else if (userInput < randomlyGeneratedNumber) {
                  System.out.println("Entered number is LOWER than the generated number! Guess higher!");
            } else {
                  
                  System.out.printf("Entered number %d matched the RGN: %d\n", userInput, randomlyGeneratedNumber);
            }
            
            
            
            
        } while(userInput != randomlyGeneratedNumber);
        
    }
}
