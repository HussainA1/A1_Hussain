package org.hussain.maps;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        // Guess the number : Generate a number
        System.out.println("Guess a number between 0-100 : ");
        Scanner sc = new Scanner(System.in);
        int generatedNumber = (int)(Math.random() * 100);
        int myNumber = 1;
        while(myNumber>0) {
            myNumber = sc.nextInt();
            if (myNumber > generatedNumber)
                System.out.println("Your number is too large");
            else if (myNumber < generatedNumber)
                System.out.println("Your number is too small");
            else if (myNumber == generatedNumber) {
                System.out.println("WooHoo..! Correct..!");
                break;
            }
        }
        System.out.println("Generated number was : " + generatedNumber);
    }
}
