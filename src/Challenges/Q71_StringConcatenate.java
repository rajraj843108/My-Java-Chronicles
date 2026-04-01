package Challenges;

import java.util.Locale;
import java.util.Scanner;

public class Q71_StringConcatenate {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your 1st string: ");
        String st1=sc.next();
        System.out.print("Please enter 2nd string: ");
        String st2=sc.next();
        //1st METHOD
     //   System.out.println("Final String is: "+st1+" "+st2);

        //2nd METHOD
     //   System.out.printf("Final ans is: %S %S",st1,st2);

        //3rd METHOD
//        StringBuilder sb=new StringBuilder();
//        sb.append("Final answer is: ");
//        sb.append(st1.toUpperCase());
//        sb.append(" ");
//        sb.append(st2.toUpperCase());
//        System.out.println(sb);

        //4th METHOD
        String newname=st1.concat(" ").concat(st2);
        System.out.println(newname.toUpperCase());


    }
}
