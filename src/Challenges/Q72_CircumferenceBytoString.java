package Challenges;

import java.util.Scanner;

class Circle {
    Scanner sc=new Scanner(System.in);
     double radius;

      Circle(double radius) {

          this.radius = radius;
     }

     double circumference(){

          return 2*radius*Math.PI;
     }

     double area(){

          return Math.PI*Math.pow(radius,2);
     }

     public String toString(){
         return "Circle Property: Radius in mm: "+radius+" ,Circumference in mm: "
                 +circumference()+" ,Area in mm2: "+area();
     }


     static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Welcome to Circle: ");
         System.out.print("Please enter your radius in mm: ");
         double num=sc.nextDouble();

         Circle mycircle=new Circle(num);
         System.out.println(mycircle);
     }

 }
