package Challenges;
import java.util.Scanner;

public class Q28_MulTable {
   public static void main(String[] args) {

        System.out.println("Welcome To Multiplication Table\n");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=sc.nextInt();

        Multiplication(num);
    }

    public static void Multiplication(int num){
        int i=1;
        while (i<=10){
            System.out.println(num + "*" + i + "=" + num*i);

         i++;
        }

    }
}