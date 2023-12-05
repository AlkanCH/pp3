public class TestBook {
    public static void main(String[] args) {
        Publisher p1 = new Publisher("abc", "New York")
        Book b1 = new Book("Witcher","Sapkowski",p1);
        b1.display();
        Book b2 = new Book("Zemsta","Aleksander Fredro");
        b2.display();

        Ebook e1 = new Ebook("Wither","Sapkowski","witcher3");
        e1.display();
        Ebook e2 = new Ebook("Silver  eyes","Scott Cawton","fnaf2");
        e2.display();

        Audiobook a1 = new Audiobook("Wesele","Wyspianski", 123, 46);
        a1.display();
    }
}
