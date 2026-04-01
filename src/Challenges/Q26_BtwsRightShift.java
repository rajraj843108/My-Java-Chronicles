package Challenges;
import java.util.Scanner;

public class Q26_BtwsRightShift {

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("To Perform Bitwise Right Shift:");
        System.out.print("Enter Your no.");

        int num1=sc.nextInt();


        int ans= num1>>1;
        System.out.println("Bitwise Right Shift of given no. is: "+ans);

    }

}
