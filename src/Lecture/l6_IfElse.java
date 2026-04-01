package Lecture;

import java.util.Scanner;

public class l6_IfElse {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible for Vote");
        }
        else {
            System.out.println("Not Eligible for Vote");
        }
    }

}
