package labs.lab11;

import java.util.ArrayList;

public class Bookshelf {
    //declaration of private data
    private int size;
    private static ArrayList <Book> books = new ArrayList<>();
    public Bookshelf() {
        this.size = 2;
        this.books = new ArrayList<>();
    }
    //I auto generated most of the constructors , getters and setters
    // constructor
    public Bookshelf(int size) {
        this.size = size;
        books = new ArrayList<>();
    }
    //parameterized constructor
    public int getSize() {
        return size;
    }
    //getter for books
    public ArrayList<Book> getBooks() {
        return books;
    }
    //method will add a book to arraylist
    public static void addBook(Book newBook){
        if(books.isEmpty() == false){
            books.add(newBook);
        }

    }
    //method will remove a book
    public ArrayList<Book> removeBook(){
        if(books.isEmpty() == true){
            return null;
        }
        this.books.remove(0);
        return this.books;
    }
    //method will clear the bookshelf
    public void emptyBookshelf(){
        this.books.clear();
    }

}
