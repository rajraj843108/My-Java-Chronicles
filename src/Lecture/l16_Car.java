package Lecture;

 class Car {
    int onOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfseats;

   // constructors
//    Car() {
//        onOfWheels = 4;
//        color = "Black";
//        maxSpeed = 150;
//        noOfseats = 7;
//        currentFuelInLiters = 2;
//    }

     Car(String color,int noOfseats){
         onOfWheels=4;
         this.color=color;
         maxSpeed=150;
         this.noOfseats=noOfseats;
         currentFuelInLiters=2;
     }

     Car() {
         this("Gray",7);
         currentFuelInLiters=5;
     }

    public Car start(){
        if (currentFuelInLiters ==0){
            System.out.println("Car is out of Fuel,can not start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode,please refuel");
        } else {
            System.out.println("Car is started.....bruhhhhhh....");
        }
        return this;
    }

    public void drive(){
            System.out.println("Car is driving");
            currentFuelInLiters--;

    }

    public void addFuel(float fuel){
        currentFuelInLiters += fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}


class Driver{
    static void main(String[] args) {
//        Car myCar=new Car();
//        myCar.addFuel(66);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(5);
//        myCar.drive();
//        myCar.maxSpeed=150;
//        System.out.println("Maxspeed: "+myCar.maxSpeed);
//        myCar.color="Red";
//        System.out.println("Color: "+myCar.color);
//        System.out.println(myCar.getCurrentFuelLevel());

//        Car swift=new Car();
//        swift.addFuel(6);
//        swift.start();
//        swift.drive();

//        Car swift=new Car();
//        swift.addFuel(6);
//        Car startedcar=swift.start();
//        startedcar.drive();

//        Car swift=new Car();
//        swift.addFuel(6);
//        swift.start().drive();

        //Constructors
        Car alto=new Car("Red",9);
        Car sumo=new Car();
        sumo.start();
        sumo.drive();
        System.out.println("Fuel: "+sumo.currentFuelInLiters);
        System.out.println("cplor: "+sumo.color);
        System.out.println();
        System.out.println("alto");
        System.out.println();

        alto.start();
        alto.drive();
    //    alto.maxSpeed=200;
        System.out.println(alto.maxSpeed);
        System.out.println(alto.color + "\n" + alto.noOfseats);
        System.out.println(alto.color);







    }

}
