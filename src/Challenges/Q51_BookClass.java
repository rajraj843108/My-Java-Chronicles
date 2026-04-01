package Challenges;

 class Book {
     static int totalNoOfBook;
     String title;
     String author;
     String isbn;
     boolean isBorrowed;

     static {
         totalNoOfBook=0;
     }

     {  //Object init.
         totalNoOfBook++;
     }

     Book(String isbn,String title,String author){
         this.isbn=isbn;
         this.title=title;
         this.author=author;
     }

     Book(String isbn){
         this(isbn,"unknown","unknown");
     }

     static int getTotalNoOfBook(){
         return totalNoOfBook;
     }

     void borrowBook(){
         if (isBorrowed){
             System.out.println("Book is already borrowed");
         } else {
             this.isBorrowed=true;
             System.out.println("Enjoy " + this.title);
         }
     }

     void returnBook(){
         if (isBorrowed){
             this.isBorrowed=false;
             System.out.println("Hope you enjoy,Please leave a review");
         } else {
             System.out.println("This book is already in the library");
         }
     }

     public static void main(String[] args) {
         Book bookone=new Book("1","Desig","Author");
         Book mybook=new Book("2");
         System.out.println(Book.getTotalNoOfBook());
         bookone.borrowBook();
         mybook.borrowBook();

         bookone.borrowBook();
         bookone.returnBook();
         bookone.returnBook();

     }

}


