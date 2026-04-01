package Challenges;
import java.util.Scanner;

public class Q27_BtwsOddEven {

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Check whether given no. is Odd/Even:");
        System.out.print("Enter your no: ");

        int num=sc.nextInt();

        if ((num & 1) ==1){
            System.out.println("Given no is Odd");
        } else {
            System.out.println("Given no is Even");
        }

    }

}
