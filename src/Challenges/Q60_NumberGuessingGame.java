package Challenges;

import java.util.Scanner;

public class Q60_NumberGuessingGame {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=6;
        int guess;
        System.out.println("Welcome to number guessing game: ");

        do {
            System.out.print("Please guess the number between 0 & 10 :");
            guess=sc.nextInt();
        } while(guess != num);
        System.out.println("You successfully guess the number");
    }
}
