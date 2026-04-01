package Challenges;

import java.util.Scanner;

public class Q65_$Break {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (true){
            System.out.print("Enter your command: ");
            String command=sc.next();
            if (command.equalsIgnoreCase("exist")){
                break;
            }
        }
        System.out.println("Your are successfully exist the loop:");
    }
}
