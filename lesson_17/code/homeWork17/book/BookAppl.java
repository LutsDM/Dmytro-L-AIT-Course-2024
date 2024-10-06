package homeWork17.book;

import homeWork17.book.model.Book;

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
    }

}
