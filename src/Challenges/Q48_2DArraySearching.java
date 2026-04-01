package Challenges;
import java.util.Scanner;

public class Q48_2DArraySearching {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to 2D Array Searching: ");
        int [][] numArray=ArrayInput.Utility2Darray();
        System.out.print("Enter the element you want to search: ");
        int num=sc.nextInt();

        boolean isFound=searching(numArray,num);
        if (isFound){
            System.out.println("Element is found:");
        } else {
            System.out.println("Element is NOT Found:");
        }

    }

    public static boolean searching(int[][] numArray,int num){

        for (int i=0;i<numArray.length;i++){
            for (int j=0;j<numArray[i].length;j++){
                if (numArray[i][j]==num){
                    return true;
                }
            }
        }

        return false;
    }

}
