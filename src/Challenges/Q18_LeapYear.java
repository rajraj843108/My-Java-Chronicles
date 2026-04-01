package Challenges;
import java.util.Scanner;

public class Q18_LeapYear {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("To Show Given Year is Leap year");
        System.out.print("Enter the year(leap or not)");
        int num=sc.nextInt();

        if (num%400==0 || (num%4==0 && num%100!=0)){
            System.out.println("Leap Year: ");
        } else {
            System.out.println("Not leap year");
        }
    }
}
