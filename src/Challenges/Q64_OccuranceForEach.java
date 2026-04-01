package Challenges;

import java.util.Scanner;

public class Q64_OccuranceForEach {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to to find no. of occurence in array");
        int Array[]=ArrayInput.Utility();
        System.out.print("Enter the no. you want to search: ");
        int nums=sc.nextInt();
        int ans=searchOcc(Array,nums);
        System.out.println("Your element was found "+ ans+" times");


    }

    public static int searchOcc(int[] Array,int nums){
        int occ=0;
        for (int num:Array){
            if (num==nums){
                occ++;
            }
        }
        return occ;
    }

}
