package Challenges;

import java.util.Scanner;

public class Q75_StrArrConcatenation {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to array string concatenation:");
        String[] arr={"I","am","best","in","the","world",
                "and","i","always","win","the","challenge:"};

        StringBuilder sb=new StringBuilder();
        for (String ans:arr){
            sb.append(ans).append(" ");
        }
        System.out.println(sb);




//        for (String name:arr){
//            System.out.println(name);
//        }

    }
}
