package Challenges;

import java.util.Scanner;

public class Q59_$PasswordChecker {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to password generator:");
        String pin;

        do {
            System.out.print("Please enter your password: ");
            pin=sc.next();
        } while(!ispassword(pin));
        System.out.println("Thanks for entering valid password");


    }

    public static boolean ispassword(String pin){

        return pin.length()>6;
    }
}
