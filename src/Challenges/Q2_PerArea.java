package Challenges;
import java.util.Scanner;

public class Q2_PerArea {
    static void main() {
        Scanner sc=new Scanner(System.in);


//        System.out.print("Enter value of A:");
//        int a=sc.nextInt();
//        System.out.print("Enter value of B:");
//        int b=sc.nextInt();
//        System.out.println("VALUE OF A+B= " +(a+b));
//        System.out.println("VALUE OF A-B= " + (a-b));
//        System.out.println("VALUE OF A*B= " + (a*b));
//        System.out.println("VALUE OF A/B= " + (a/b));
//        System.out.println("VALUE OF A%B= " + (a%b));


//        System.out.println("Enter two float value for mul. :");
//        float x=sc.nextFloat();
//        float y=sc.nextFloat();
//        System.out.println("Value: " + (x*y));


//        System.out.println("Enter all 4 side of rectangle");
//        int p=sc.nextInt();
//        int q=sc.nextInt();
//        int r=sc.nextInt();
//        int s=sc.nextInt();
//        System.out.println("Perimeter of rectangle is: " + (p+q+r+s));

//        System.out.println("Enter  2 side of rectangle");
//        int p=sc.nextInt();
//        int q=sc.nextInt();
//        System.out.println("Perimeter of rectangle is: " + (2*(p+q)));

        System.out.println("Enter heighr of triangle");
        double h=sc.nextDouble();
        System.out.println("Enter Base of triangle");
        double b=sc.nextDouble();
        double area=0.5*h*b;
        System.out.println("Area of Trinagle is: " + area);

    }

}
