package Challenges;

import java.util.Scanner;

public class Q59_PasswordChecker {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to password checker:");
        int num;
        int pin=231269;
        do {
            System.out.print("Please enter your password: ");
            num=sc.nextInt();
        } while (num!=pin);
            System.out.print("your password is:" + pin);
    }

}
