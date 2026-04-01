package Lecture;

public class l26_StringBuild {
    static void main(String[] args) {

        StringBuilder sc=new StringBuilder("I have ");
        sc.append(45);
        sc.append(" car and ");
        sc.append(55);
        sc.append(" Truck and ");
        sc.append(5);
        sc.append(" Union Tertary");
        System.out.println(sc.toString());
        System.out.println();
        System.out.println(sc);



    }
}
