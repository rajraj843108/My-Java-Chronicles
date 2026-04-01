package Challenges;

import java.util.Scanner;

public class Q74_RandomNoGussingGame {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double random=Math.random()*100;
        double newRandom=Math.ceil(random);
        int num;
        System.out.println("Welcome to number guessing Game b/w 1 To 100:");

        do {
            System.out.print("Please enter your number: ");
            num=sc.nextInt();

            if (num > newRandom) {
                System.out.println("Too high!");
            } else if (num < newRandom) {
                System.out.println("Too low!");
            }

        } while (num != newRandom);

        System.out.println("You successfully find the number:");


    }


}
