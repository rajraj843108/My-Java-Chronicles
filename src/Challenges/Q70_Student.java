package Challenges;

 class Student {
     String name;
     int age;
     String id;
     String course;

     @Override
     public String toString() {
         final StringBuilder sb = new StringBuilder("Student{");
         sb.append("name='").append(name).append('\'');
         sb.append(", age=").append(age);
         sb.append(", id='").append(id).append('\'');
         sb.append(", course='").append(course).append('\'');
         sb.append('}');
         return sb.toString();
     }




     public Student(String name, int age, String id, String course) {
         this.name = name;
         this.age = age;
         this.id = id;
         this.course = course;
     }

     static void main(String[] args) {
//         Student Raj=new Student();
//         Raj.name="Rishi";
//         Raj.age=20;
//         Raj.id="0133CS231269";
//         Raj.course="Java";
//         System.out.println(Raj);

         Student mannu=new Student("Mannu",21,"0133CS12288","Java");
         System.out.println(mannu);
     }
 }
