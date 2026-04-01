package Challenges;
import java.util.Scanner;

public class Q49_sumAndAvg2Darray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to 2D Array Summation and Avg: ");
        int[][] numArray=ArrayInput.Utility2Darray();

        double sum=0;
        for (int i=0;i< numArray.length;i++){
            for (int j=0;j<numArray[i].length;j++){
                sum=sum + numArray[i][j];
            }
        }
        System.out.println("SUM IS: " + sum);

        int n1= numArray.length;
        int n2= numArray[0].length;
        int n3=n1*n2;

        double avg= sum/n3;
        System.out.println("AVG: "+ avg);


    }


}
