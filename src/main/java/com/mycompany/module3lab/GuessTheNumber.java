/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module3lab;

/**
 *
 * @author haris
 */
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(1000) + 1;
            int guess = 0;
            int numGuesses = 0;

            System.out.println("I'm thinking of a number between 1 and 1000. Can you guess what it is?");
            while (guess != numberToGuess) {
                System.out.println("Enter your guess: ");
                guess = input.nextInt();
                numGuesses++;

                if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                }
            }

            System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses.");
            System.out.println("Do you want to play again? (y/n): ");
            String playAgainResponse = input.next().toLowerCase();
            playAgain = playAgainResponse.equals("y") || playAgainResponse.equals("yes");
        }
    }
}
