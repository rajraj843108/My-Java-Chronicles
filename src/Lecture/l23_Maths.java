package Lecture;

import java.util.Scanner;

public class l23_Maths {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println(Math.abs(-96));
        System.out.println(Math.ceil(8.23));
        System.out.println(Math.floor(8.86));
        System.out.println(Math.round(8.26));
        System.out.println(Math.round(8.78));
        System.out.println(Math.max(5,8));
        System.out.println(Math.min(3,9));
        System.out.println(Math.pow(10,2));
        System.out.println(Math.sqrt(4));
        System.out.println (Math.ceil (Math.random()*10) + " Random");
        System.out.println(Math.log(20));

        System.out.println();

        for (int i = 0; i < 10; i++) {
            int random=(int) Math.round( Math.random()*100);
            System.out.println(random);
        }

    }
}
