package Lecture;

import java.util.Scanner;

public class l7_ElseIf {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome To Ticket Discount Calculator");
        System.out.print("Please Enter Your age: ");
        int age=sc.nextInt();
        System.out.println("Are You a female[true/false]:");
        boolean isfemale=sc.nextBoolean();

        if(age<5){
            System.out.println("You got 75% Discount");
        } else if (isfemale) {
            System.out.println("You got 50% Discount");
        } else if (age>60) {
            System.out.println("You got 25% Discount");
        } else {
            System.out.println("You got no any Discount");
        }


    }
}
