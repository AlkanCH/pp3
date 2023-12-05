public class Book {
    private String title;
    private String author;
    private Publisher publisher;
    
    public Book(String title, String author, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
    }
}
