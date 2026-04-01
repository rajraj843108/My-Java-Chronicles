package Challenges;
import java.util.Scanner;

public class Q22_BtwsOR {

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("To Perform Bitwise OR:");
        System.out.print("Enter 2 no.");

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int ans=num1 | num2;
        System.out.println("Bitwise OR of given no. is: "+ans);

    }

}
