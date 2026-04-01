package Oops.F_Polmorphism;

public class Overloading {

    public int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public String add(String a,String b){
        return a+" "+ b;
    }


   public static void main(String[] args) {
        Overloading over=new Overloading();

       System.out.println(over.add(7,5));
       System.out.println(over.add(7,5,2,4));
       System.out.println(over.add("Rishi","Raj"));


    }



}
