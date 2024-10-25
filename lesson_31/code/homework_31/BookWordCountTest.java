package homework_31;

import classwork_31.cities.City;
import homework_27.marathon.book_library.entity.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;
class BookWordCountTest {

    BookWordCount[] books;


    @BeforeEach
    void setUp() {
        books = new BookWordCount[6];

        books[0] = new BookWordCount("War and Peace", 587287);
        books[1] = new BookWordCount("Harry Potter and the Order of the Phoenix", 257045);
        books[2] = new BookWordCount("The Lord of the Rings", 455125);
        books[3] = new BookWordCount("Moby-Dick", 209117);
        books[4] = new BookWordCount("1984", 88942);
        books[5] = new BookWordCount("The Great Gatsby", 47094);
    }

    private void printArray (Object[] array, String titleOfReport) {
        System.out.println("--------------" + titleOfReport + "------------------");
        for (Object o : array) {
            System.out.println(o);
        }
    }

    @Test
    void testComparabel(){
        printArray(books, ":List of books as is");
        Arrays.sort(books);
        printArray(books,"List of book sorted by count of words.");
        BookWordCount pattern = new BookWordCount(null, 122189) ; //"Pride and Prejudice"
        int index = Arrays.binarySearch(books,pattern);
        System.out.println(index);
    }

    @Test
    void testComparatorByName() {
        Comparator<BookWordCount> comparatorByBookName = new Comparator<BookWordCount>() {
            @Override
            public int compare(BookWordCount o1, BookWordCount o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(books, comparatorByBookName);
        printArray(books, "List of books sorted by title.");
        BookWordCount pattern = new BookWordCount("Brave New World", 0);
        int index = Arrays.binarySearch(books, pattern, comparatorByBookName);
        if (index >= 0) {
            System.out.println("Find book " + pattern.getName() + " on index " + index);
        } else {
            System.out.println("Book " + pattern.getName() + "did not find, but it could be on index " + (-index - 1));
        }
    }


    @Test
    void testArrayCopy(){
        BookWordCount[] booksCopy = Arrays.copyOf(books,books.length + 3);
        printArray(booksCopy,"booksCopy as is");
        System.out.println(booksCopy.length);
        Comparator<BookWordCount> comparatorByName = Comparator.nullsLast((c1, c2) -> c1.getName().compareTo(c2.getName()));
        Arrays.sort(booksCopy, comparatorByName);
        printArray(booksCopy, "booksCopy after sorting by name");

        BookWordCount pattern = new BookWordCount("Fahrenheit 451", 0);
        int index = Arrays.binarySearch(booksCopy, 0, books.length, pattern, comparatorByName);
        System.out.println(index);
    }

    @Test
    void testInsertKeepSorting(){
        Arrays.sort(books);
        printArray(books, "Native sorting");

        BookWordCount[] booksCopy3 = Arrays.copyOf(books,books.length + 1);
        BookWordCount book = new BookWordCount("Fahrenheit 451", 46118);
        int index = Arrays.binarySearch(booksCopy3, 0, booksCopy3.length - 1, book);
        index = index >= 0 ? index :-index -1; //обработка индекса
        //готовим место для вставки
        System.arraycopy(booksCopy3, index, booksCopy3,index + 1, booksCopy3.length - index -+1);
        booksCopy3[index] = book;
        books = booksCopy3; //переопределили ссылку на массив
        printArray(books, "List with added book");

    }

}