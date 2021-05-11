package com.ss.mar.a2;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args){
        randomNumGuess();
    }

    public static void randomNumGuess(){
        Random picker = new Random();
        Scanner guess = new Scanner(System.in);
        int count = 1;
        int upperLimit = 100;
        int numberToGuess = picker.nextInt(upperLimit);
        System.out.println("Please Guess an Int 1-100");
        int guessedNum = guess.nextInt();


        while (guessedNum < (numberToGuess-10) || guessedNum > (numberToGuess+10) && count < 5) {
            count++;
            System.out.println(count);
            guessedNum = guess.nextInt();

        }
        if(count == 5 && guessedNum < (numberToGuess-10) || guessedNum > (numberToGuess+10) ){
            System.out.println("Sorry");
            System.out.println(numberToGuess);
        }
        else {
            System.out.println("Correct answer");
            System.out.println(numberToGuess);
        }





    }
}
