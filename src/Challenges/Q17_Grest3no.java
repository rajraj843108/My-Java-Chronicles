package Challenges;
import java.util.Scanner;

public class Q17_Grest3no {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("To determine Greatest of 3 number");
        System.out.print("Enter your any 3 number");

        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        System.out.print("Greatest Number is: ");

        if (num1>num2 && num1>num3){
            System.out.println(num1);
        } else if (num2>num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }


    }
}
