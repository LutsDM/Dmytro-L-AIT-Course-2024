package homework_27.marathon.book_library.test;

import homework_27.marathon.book_library.dao.Library;
import homework_27.marathon.book_library.dao.LibraryImpl;
import homework_27.marathon.book_library.entity.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LibraryImplTest {

    Library library;
    Book[] books;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(6);
        books = new Book[5];

        books[0] = new Book(111_111_111_111_0L, "title01", "Kafka", 1995);
        books[1] = new Book(111_111_111_111_1L, "title02", "Kafka", 1990);
        books[2] = new Book(111_111_111_111_2L, "title03", "Goethe", 1995);
        books[3] = new Book(111_111_111_111_3L, "nazva", "Goethe", 2023);
        books[4] = new Book(111_111_111_111_4L, "nazva1", "Goethe", 2024);

        for (int i = 0; i < books.length; i++) {
            library.addBook(books[i]);
        }
    }

    @Test
    void addBookTest() {
        // Проверяем успешное добавление книги
        Book newBook = new Book(111_111_111_111_5L, "newTitle", "NewAuthor",
                2021);
        assertTrue(library.addBook(newBook));

        // Проверяем, что книга действительно добавилась
        assertNotNull(library.findBook(newBook.getIsbn()));
    }

    @Test
    void removeBookTest() {
        assertEquals(books[1], library.removeBook(111_111_111_111_1L));
        assertEquals( 4, library.size());
        assertNull(library.removeBook(111_111_111_111_1L));
    }
    @Test
    void findBookTest() {
       Book foundBook = library.findBook(111_111_111_111_0L);
        assertNotNull(foundBook);
        assertEquals(books[0], foundBook);
    }

    @Test
    void findBooksByAuthorTest() {
        Book[] expected = {books[2], books[3], books[4]};
        Book[] actual = library.findBooksByAuthor("Goethe");
        assertArrayEquals(expected,actual);

    }

    @Test
    void findBooksByYearOfPublishingTest() {
        Book[] expected = {books[0], books[2]};
        Book[] actual = library.findBooksByYearOfPublishing(1995);
        assertArrayEquals(expected,actual);

    }

    @Test
    void findBookByTitleTest() {
        Book[] expected = {books[2]};
        Book[] actual = library.findBookByTitle("title03");
        assertArrayEquals(expected,actual);

    }

    @Test
    void printTest() {
        library.print();
    }
}