package Challenges;
import java.util.Scanner;

public class Q25_BtwsLeftShift {

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("To Perform Bitwise Left Shift:");
        System.out.print("Enter Your no.");

        int num1=sc.nextInt();


        int ans= num1<<1;
        System.out.println("Bitwise COMPLIMENT of given no. is: "+ans);

    }

}
