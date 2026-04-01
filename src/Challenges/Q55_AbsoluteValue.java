package Challenges;

import java.util.Scanner;

public class Q55_AbsoluteValue {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to Absolute Number checker:");
        System.out.print("Enter your  number: ");
        int num=sc.nextInt();
        int ans=num>=0? num:-num;
        System.out.println(ans);



    }
}
