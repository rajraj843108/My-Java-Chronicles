package Challenges;
import java.util.Scanner;

public class Q14_FarnToCelsius {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Fahrenheit to celsius Conversion");
        System.out.print("Enter Value of Fahrenheit: ");
        float f=sc.nextFloat();
//        float c=5*(f-32)/9;
        double c= ((5.0/9.0)*(f-32));

        System.out.println("Value of Celsius is: " + c);
    }
}
