package Challenges;

 class FinalCar {

     final int noOfWheel;
     final String modelNo;
     final String engineNo;
     final int fuelCapicity;

     public FinalCar(int noOfWheel, String modelNo, String engineNo, int fuelCapicity) {
         this.noOfWheel = noOfWheel;
         this.modelNo = modelNo;
         this.engineNo = engineNo;
         this.fuelCapicity = fuelCapicity;
     }

     @Override
     public String toString() {
         final StringBuilder sb = new StringBuilder("FinalCar{");
         sb.append("noOfWheel=").append(noOfWheel);
         sb.append(", modelNo='").append(modelNo);
         sb.append(", engineNo='").append(engineNo);
         sb.append(", fuelCapicity=").append(fuelCapicity);
         sb.append('}');
         return sb.toString();
     }

     static void main(String[] args) {

         FinalCar audi=new FinalCar(4,"45E9ZR0",
                 "0123wqz4",50);

         System.out.println(audi);

     }


 }
