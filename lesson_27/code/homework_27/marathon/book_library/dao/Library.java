package homework_27.marathon.book_library.dao;

import homework_27.marathon.book_library.entity.Book;

public interface Library {

    boolean addBook (Book book);

    Book removeBook(long isbn);

    Book findBook(long isbn);

    Book[] findBooksByAuthor (String author);

    Book[] findBooksByYearOfPublishing (int yearOfPublishing );

    Book [] findBookByTitle (String title);

    void print();

    void printBooks(Book[] books);

    int size();
}
