package Challenges;
import java.util.Scanner;

public class Q34_checkPrimeOrNot {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("To Check Whether No. is Prime Or Not");
        System.out.print("Enter your Number:");
        int num=sc.nextInt();

        boolean ans=isPrime(num);
        if (ans){
            System.out.println("Given Number is Prime");
        }else{
            System.out.println("Given No. is Not Prime");
        }

    }

    public static boolean isPrime(int num){

        int i=2;
        while (i<num){
            if (num%i==0){
                return false;
            }
            i++;
        }
        return true;

    }
}
