package Challenges;
import java.util.Scanner;

public class Q16_OddEven {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("To Check Whether Given Number is Odd Or Even");
        System.out.print("Enter Your Number Please: ");
        int num=sc.nextInt();

        if (num%2==0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

    }
}
