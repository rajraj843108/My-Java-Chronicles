package Lecture;

public class l21_BreakContinue {
    static void main(String[] args) {

        //Break
        for (int i=1;i<1000;i++){
            if (i==101){
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        //Continue
        for (int j=1;j<10;j++){
            if (j==5){
                continue;
            }
            System.out.print(j +" ");
        }






    }
}
