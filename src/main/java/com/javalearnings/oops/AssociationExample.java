package com.javalearnings.oops;

public class AssociationExample {
    static class Library{
        private String name;
        private String address;

        public Library(String name,String address){
            this.name=name;
            this.address=address;
        }
        public void print(){
            System.out.println("Library name:"+name);
            System.out.println("Library address:"+address);

        }

    }
    static class Book{
        private String Bookname;
        private String author;
        public Book(String Bookname,String author){
           this.Bookname=Bookname;
           this.author=author;
        }
        public void print(){
            System.out.println("Book name:"+Bookname);
            System.out.println("Author name: " + author);
        }

    }

        public static void main(String[] args) {
            Library library = new Library("Vels Library", "Pallavaram, Chennai");
            library.print();

            Book book = new Book("Basics of AI & ML", "Dr. Dheeraj Mehrotra");
            book.print();
        }


    }

