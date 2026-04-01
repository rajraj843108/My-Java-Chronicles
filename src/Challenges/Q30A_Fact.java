package Challenges;
import java.util.Scanner;

public class Q30A_Fact {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Factorial!\n");
        System.out.print("Enter your no to find factorial: ");
        int num=sc.nextInt();

        long ans=factorial(num);
        System.out.println("Factorial is: " + ans);


    }

    public static long factorial(int num){

        if (num<2){
            return 1;
        }
        long fact=1;
        int i=2;
        while (i<=num){
            fact*=i;
            i++;
        }

        return fact;
    }


}
