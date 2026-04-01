package Lecture;

import java.util.Scanner;

public class l19_DoWhile {
    static void main() {
        Scanner sc=new Scanner(System.in);
  //      System.out.print("Enter your age: ");
 //       int age=sc.nextInt();
//        while (age<0 || age>100){
//            System.out.print("Please enter your age: ");
//            age=sc.nextInt();
//        }
//        System.out.println("Your age is "+ age);

        int  age;
        do {
            System.out.print("Please enter your age: ");
            age=sc.nextInt();
        } while (age<0 || age>100);
            System.out.println("Your age is "+age);


    }

}
