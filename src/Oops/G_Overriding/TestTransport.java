package Oops.G_Overriding;

import Oops.F_Polmorphism.Plane;
import Oops.F_SuperKeyword.Car;

public class TestTransport {
    static void main(String[] args) {

        Car c=new Car();
        Plane p=new Plane();
        c.start();
        p.start();

    }



//    private static void castTest(Vehicle veh){
//        veh.start();
//    }

}
