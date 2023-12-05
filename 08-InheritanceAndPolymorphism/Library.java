import java.util.ArrayList;

public class Library {
    static ArrayList<Book> book = new ArrayList<Book>();

    public static void main(String[] args) {
        Book b1 = new Book("Witcher","Sapkowski");
        Ebook e2 = new Ebook("Silver  eyes","Scott Cawton","fnaf2");
        Audiobook a1 = new Audiobook("Wesele","Wyspianski", 123, 46);

        book.add(b1);
        book.add(e2);
        book.add(a1);

        for(Book i: book){
            i.display();
            System.out.println();
        }
        
    }
}
