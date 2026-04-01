package Lecture;

import java.util.Scanner;

public class l9_Method {
    static void main(String[] args) {
        greetuser();

        pattern();

        System.out.println("Method calling complete");
    }


    static void greetuser() {

        System.out.println("Good Moning!\n");

    }

    static void pattern() {

        int i=0;
        while (i<5){
           System.out.print("*");
            int j=0;
            while (j<i){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }

    }







}
