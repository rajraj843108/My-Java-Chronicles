package Oops.AGetterSetter;

 public class Car09 {
     private String color;   //public

     private String model;  //public

     private double fuelLevel;

     private long costOfCar;  //default

     public String getColor() {return color;}

     public void setColor(String color){
         this.color=color;
     }


     public String getModel(){
         return model;
     }


     public Car09(String color, String model, double fuelLevel, long costOfCar) {
         this.color = color;
         this.model = model;
         this.fuelLevel = fuelLevel;
         this.costOfCar = costOfCar;
     }

     @Override
     public String toString() {
         final StringBuilder sb = new StringBuilder("Car09{");
         sb.append("color='").append(color).append('\'');
         sb.append(", model='").append(model).append('\'');
         sb.append(", fuelLevel=").append(fuelLevel);
         sb.append(", costOfCar=").append(costOfCar);
         sb.append('}');
         return sb.toString();
     }
 }
