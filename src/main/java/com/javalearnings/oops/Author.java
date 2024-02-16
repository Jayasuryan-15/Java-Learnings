package com.javalearnings.oops;

class Author {
    String authorname;
    int age;
    String place;

    public Author(String authorname, int age, String place) {
        this.authorname = authorname;
        this.age = age;
        this.place = place;
    }
}

class Book {
    String Bookname;
    int Bookprice;
    Author author;

    public Book(String Bookname, int Bookprice, Author author) {
        this.Bookname = Bookname;
        this.Bookprice = Bookprice;
        this.author = author;
    }

    void display() {
        System.out.println("Book Name: " + Bookname);
        System.out.println("Book Price: " + Bookprice);
        System.out.println("Author Name: " + author.authorname);
        System.out.println("Author Age: " + author.age);
        System.out.println("Author Place: " + author.place);
    }

    public static void main(String[] args) {
        Author author1 = new Author("SureshRaina", 37, "India");
        Author author2 = new Author("Raina", 37, "India");
        Book book1 = new Book("Believe", 500, author1);
        Book book2 = new Book("Living Again", 600, author2);
        book1.display();
        book2.display();
    }
}