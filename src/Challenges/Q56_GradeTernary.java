package Challenges;

import java.util.Scanner;

public class Q56_GradeTernary {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to Student Score checker:");
        System.out.print("Enter your  number: ");
        int num=sc.nextInt();

        String score= num>80? "High" : (num >50? "Modrate" : "low");
        System.out.println(score);

    }
}
