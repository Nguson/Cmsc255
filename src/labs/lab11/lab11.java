package labs.lab11;

public class lab11 {
    public static void main(String[]args){
        Book book1 = new Book("The Hunger Games", "Suzanne Collins");
        Book book2 = new Book("Chainsaw Man", "Tatsuki Fujimoto");
        Book book3 = new Book("Jujutsu Kaisen", "Gege Akutami");
        //this should add the books into the arraylist
        //Im not sure how to change the method to be static for this to work.
        //it should call the method which adds a book into it
        Bookshelf bookShelf = new Bookshelf();
        Bookshelf.addBook(book1);
        Bookshelf.addBook(book2);
        Bookshelf.addBook(book3);
        //this is a for loop that prints out the books
        for (Book bookPrint : bookShelf.getBooks()) {
            System.out.println(bookPrint.toString());
        }
        // empty the bookshelf
        bookShelf.emptyBookshelf();
        //print the bookshelf which should be empty
        for (Book emptyBook : bookShelf.getBooks()){
            System.out.println(emptyBook.toString());
        }
    }
}
