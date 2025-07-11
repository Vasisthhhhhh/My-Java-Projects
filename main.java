// package com.javanitin;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int myNum= (int)(Math.random() * 100); // Generate a random number between 0 and 99
        int userNumber;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 0 and 99. Can you guess it?");
        System.out.println("You can exit the game at any time by entering -1.");

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Guess a number between 0 and 99:");
            userNumber = sc.nextInt();

            if (userNumber == -1) {
                break;
            }
            else if (userNumber == myNum){
                System.out.println("WOHOOO! CORRECT NUMBER!");
                break;
            }
            else if (userNumber < myNum){
                System.out.println("Your number is too small. Try again.");
            }
            else {
                System.out.println("Your number is too large. Try again.");
            }   
        }while(userNumber != -1);
            if (userNumber == -1) {
                System.out.println("You exited the game. The correct number was: " + myNum);
            } else {
                System.out.println("Congratulations! You guessed the number: " + myNum);
            }
    }
}