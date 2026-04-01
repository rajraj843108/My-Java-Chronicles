package Oops.F_SuperKeyword;

public class Car extends Vehicle {

    public Car() {
    }

    public Car(int noOftyre) {
        super(noOftyre);
    }

    @Override
    public void start() {
        System.out.println(super.getNoOftyre());
        System.out.println("car is starting...");
    }


   public static void main(String[] args) {
        Car c=new Car();
       System.out.println(c.getNoOftyre());
       System.out.println();
        c.start();
    }

}


