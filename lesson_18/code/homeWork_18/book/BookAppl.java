package homeWork_18.book;

import homeWork_18.book.model.Book;
import homeWork_18.book.model.Dictionary;

public class BookAppl {
    public static void main(String[] args) {
        Book book1 = new Book("763-2332-32-3", "Lord of the Rings", "D.Tolkien", 1954, "fantasy");
        book1.displayBook();
        System.out.println();

        Book book2 = new Book( "To Kill a Mockingbird", "Harper Lee", 1960, "classic fiction");
        book2.displayBook();
        System.out.println();

        Book book3 = new Book("The Da Vinci Code", "Dan Brown", "mystery thriller");
        book3.displayBook();
        System.out.println();

        Dictionary dictionary1 = new Dictionary("756-2653-87-3", "Abbreviated Dictionary", "J.Braun",1995,"dictionary", "technical", "english", 3000);

        dictionary1.displayBook();

        Dictionary dictionary2 = new Dictionary("524-9853-00-1", "English-Russian dictionary", "IMNH",2000,"dictionary",
                "linguistics", "english", 6000);

        dictionary2.displayBook();

        Dictionary dictionary3 = new Dictionary("999-9111-90-5", "Oxford Concise Medical Dictionary", "Oxford IH",2001,
                "dictionary",
                "Medical", "english", 4000);

        dictionary3.displayBook();

    }

}
