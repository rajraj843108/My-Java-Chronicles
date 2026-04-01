package Challenges;
import java.util.Scanner;

public class Q33_GCD {
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to find GCD of 2 number:-");
        System.out.print("Enter your 2 no. for finding GCD;  ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int ans=gcdOfNumber(num1,num2);
        System.out.println("GCD of given no is: " + ans);

    }

    public static int gcdOfNumber(int num1,int num2){
        int gcd=1;
        int i=2;
        int least=least(num1,num2);
        while (i<=least){
            if (num1 % i ==0 && num2 % i == 0){
                gcd=i;
            }
            i++;
        }

        return gcd;

    }

    public static int least(int num1,int num2){
        if (num1<num2){
            return num1;
        } else {
            return num2;
        }
    }

}
