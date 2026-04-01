package Oops.F_Polmorphism;

public class TestTransport {
    static void main(String[] args) {

      //  Vehicle v=new Vehicle();
        Car c=new Car();
        Plane p=new Plane();

        Vehicle vcar=new Car();

//        Car cvehicle= (Car) new Vehicle();

//        Object ref = new Vehicle();
//        Object ans = new Vehicle();
        Object refa = new Car();

     //   castTest(v);
        castTest(c);
        castTest(p);

    }

    private static void castTest(Vehicle veh){
        veh.start();

    }

}
