package Lecture;

import java.util.Scanner;

public class l2_userInput {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Yuor name");
        String name=sc.nextLine();
        System.out.println("Good Morning:"+name);
        System.out.print("Enter Your age");
        int age=sc.nextInt();
        System.out.println("Your age is:"+age);


//        System.out.print("Enter Your name:");
//        String namee=sc.nextLine();
//        System.out.println("Welcomr " +namee+ " to KG Coding");


//        System.out.println("Enter two number for sum: ");
//        int num1=sc.nextInt();
//        int num2=sc.nextInt();
//        int sum=num1+num2;
//        System.out.println("Sum of given no is: "+sum);


    }
}

