package bookpackext;
import bookpack.*;

public class UseBook {
    public static void main(String args[]) {
        bookpack.Book books[] = new bookpack.Book[5];

        books[0] = new Book("Java: A Beginners Guide",
                "Schildt", 2014);
        books[1] = new Book("Java: The Complecte Reference",
                "Schildt", 2014);
        books[2] = new Book("The Art of Java",
                "Schildt and Holmes", 2003);
        books[3] = new Book("Red Storm Rising",
                "Clancy", 1986);
        books[4] = new Book("On the Road",
                "Kerouac", 1955);

        for(int i = 0; i < books.length; i++) books[i].show();
    }
}

