package Challenges;

import java.util.Scanner;

public class Q62_PrimeOrNot {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to check number is prime or not :");
        System.out.print("Enter our number: ");
        int num=sc.nextInt();
        boolean ans=isprime(num);
        if (ans){
            System.out.println("Ginen no. is Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static boolean isprime(int num){
        for (int i=2;i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
