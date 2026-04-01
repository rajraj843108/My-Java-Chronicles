package Challenges;

import java.util.Scanner;

public class Q66_Continue {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to counting continue:  ");
        System.out.print("Enter your number:");
        int num=sc.nextInt();

        for (int i=1;i<=num;i++){
            if (i==num/2){
                System.out.println("Inside Continue");
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
