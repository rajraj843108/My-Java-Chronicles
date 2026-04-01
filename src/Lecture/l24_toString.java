package Lecture;

 class Car01 {
  int noOfWheel;
  int noOfDoor;
  int maxSpeed;
  String name;
  String modelName;
  String company;


  public Car01(int noOfWheel, int noOfDoor, int maxSpeed, String name,
             String modelName, String company) {
   this.noOfWheel = noOfWheel;
   this.noOfDoor = noOfDoor;
   this.maxSpeed = maxSpeed;
   this.name = name;
   this.modelName = modelName;
   this.company = company;
  }

//  @Override
//  public String toString() {
//   return "Car01{" +
//           "noOfWheel=" + noOfWheel +
//           ", noOfDoor=" + noOfDoor +
//           ", maxSpeed=" + maxSpeed +
//           ", name='" + name + '\'' +
//           ", modelName='" + modelName + '\'' +
//           ", company='" + company + '\'' +
//           '}';
//  }


  @Override
  public String toString() {
   final StringBuilder sb = new StringBuilder("Car01{");
   sb.append("noOfWheel=").append(noOfWheel);
   sb.append(", noOfDoor=").append(noOfDoor);
   sb.append(", maxSpeed=").append(maxSpeed);
   sb.append(", name='").append(name).append('\'');
   sb.append(", modelName='").append(modelName).append('\'');
   sb.append(", company='").append(company).append('\'');
   sb.append('}');
   return sb.toString();
  }

  static void main(String[] args) {

   Car01 swift=new Car01(4,5,120,"swift","XYZ34E","Maruti");
   System.out.println(swift);



  }

 }


