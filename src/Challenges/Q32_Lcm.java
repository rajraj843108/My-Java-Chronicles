package Challenges;
import java.util.Scanner;

public class Q32_Lcm {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to find LCM of 2 number:-");
        System.out.print("Enter your 2 no. for finding LCM;  ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int ans=lcmOfNumber(num1,num2);
        System.out.println("LCM of given no is: " + ans);

    }

    public static int lcmOfNumber(int num1,int num2){
        int i=1;
        while (i<num2){
            int fact=num1*i;
            if (fact%num2==0){
                return fact;
            }
            i++;
        }
        return 0;

    }

}
