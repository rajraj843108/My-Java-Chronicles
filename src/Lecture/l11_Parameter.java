package Lecture;

import java.util.Scanner;

public class l11_Parameter {
    static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        int num1=sc.nextInt();
//        int num2=sc.nextInt();

        int sum=sumOfNumber(7,5);
        System.out.println(sum);


//        sumOfNumber(5,4);

    }

    public static int sumOfNumber(int num1,int num2){
        System.out.println("First Number received: " + num1);
        System.out.println("Second Number received: " + num2);
        return num1+num2;
    }


}
