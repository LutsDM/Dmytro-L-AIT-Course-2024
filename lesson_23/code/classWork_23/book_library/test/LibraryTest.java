package classWork_23.book_library.test;

import classWork_23.book_library.controller.Library;
import classWork_23.book_library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library library;

    Book[] books;
    int size = 0;

    @BeforeEach
    void setUp() {

        library = new Library(5);

        books = new Book[5];

        books[0] = new Book("1984", "Oruell", 1_111_111_111_110L, 2010);
        books[1] = new Book("T1", "A1", 1_111_111_111_111L, 2011);
        books[2] = new Book("T2", "A2", 1_111_111_111_112L, 2009);
        books[3] = new Book("T3", "A3", 1_111_111_111_113L, 2005);

        // TODO
        //положить объекты в массив, который "внутри" объекта library
        for (int i = 0; i < books.length - 1; i++) { //пока только 4 книги (size = 4) ""
            library.addBook(books[i]);

        }

    }

    //- не добавлять null
    //- не добавлять дубликат
    //- не добавлять больше, чем может вместить в себя библиотека.

    @Test
    void addBookTest(){
        assertFalse(library.addBook(null)); //не добовляй null
        assertFalse(library.addBook((books[2]))); //не добовлять дубликат

        // добавить еще одну книжку
        Book newBook = new Book("T4", "A4", 1_111_111_111_114L, 2024);
        assertTrue(library.addBook(newBook));
        assertEquals(5, library.size());
        // добовляем еще одну capacity
        Book oneMoreBook = new Book ("T5", "A5", 1_111_111_111_115L, 2024);
        assertFalse(library.addBook(oneMoreBook));
    }

    @Test
    void findBookTest(){
        Book foundBook = library.findBook(1_111_111_111_110L);
        assertEquals( books[0], library.findBook(1_111_111_111_110L)); // find existed book
        assertNull(library.findBook(1_111_111_111_119L)); // find absent book
        //
    }

    @Test
    void removeBook(){
        assertEquals(books[0], library.removeBook(1_111_111_111_110L));
        assertEquals(3, library.size());
        assertNull(library.removeBook(1_111_111_111_119L));
    }

    @Test
    void sizeTest() {
        assertEquals(4, library.size());
    }

    @Test
    void printBooksTest(){
        System.out.println("=========================");
        library.printBook();
    }

    @Test
    void updateBookTest(){
        Book newBook = new Book("New book", "Super puper", 1_111_111_111_114L, 2025);
        library.addBook(newBook);
        //library.update

    }

}
