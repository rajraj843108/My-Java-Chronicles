package Oops.C_KgCoding;

import Oops.AGetterSetter.Car09;

public class Gettertest {
    static void main(String[] args) {

        Car09 mycar=new Car09("Red","ZDK45V",15,50000);

         System.out.printf("%s %s",mycar.getColor(),mycar.getModel());
         System.out.println();

        System.out.println(mycar);

         mycar.setColor("Blue");

         System.out.println(mycar.getColor());


    }

}
