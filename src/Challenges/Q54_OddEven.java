package Challenges;

import java.util.Scanner;

public class Q54_OddEven {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to odd even checker:");
        System.out.print("Enter your  number: ");
        int num1=sc.nextInt();

//        boolean oddeven=num1%2==0 ? true:false;
//        System.out.println(oddeven);

        String ans= num1%2==0?"Even":"Odd";
        System.out.println(ans);

    }
}
