package labs.lab11;

public class Book {
        //declaration of private data
    private String author;
    private String title;
    //first constructor
    public Book() {
        this.author = null;
        this.title = "Test";
    }
    //parameterized constructor
    public Book(String title, String author){
        this.author = author;
        this.title = title;
    }
    //getter method
    public String getAuthor() {
        return author;
    }
    //setter method
    public void setAuthor(String author) {
        this.author = author;
    }
    //getter method
    public String getTitle() {
        return title;
    }
    //setter method
    public void setTitle(String title) {
        this.title = title;
    }
    //toString method returns author and title
    public String toString(){
        return  "\"" + title + "\"" + " " + "by " + author;
    }
}
