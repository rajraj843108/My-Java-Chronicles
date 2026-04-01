package Lecture;

import java.util.Scanner;

public class l18_Switch {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to day of the week dector");
        System.out.print("Enter your day in number: ");
        int day= sc.nextInt();

//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thrusday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6: //Fall through
//            case 7:
//                System.out.println("holiday");
//                break;
//            default:
//                System.out.println("Invalid Input");
//                break;



        String output=switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Holiday";
//            case 7 -> "Sunday";
            default -> "Invalid";
        };
        System.out.println(output);


    }
}
