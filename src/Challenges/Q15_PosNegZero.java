package Challenges;
import java.util.Scanner;

public class Q15_PosNegZero {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("To Check Whether Number is Positive,Negative,or Zero");
        System.out.print("Enter Number");
//        int num=sc.nextInt();
        float num=sc.nextFloat();

        if (num>0){
            System.out.println("Positive Number");
        } else if (num==0){
            System.out.println("Number is Zero,nither Positive nor negative");
            } else {
            System.out.println("Negative Number");
        }

    }

}

