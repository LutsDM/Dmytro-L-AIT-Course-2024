package homework_27.marathon.book_library;

import homework_27.marathon.book_library.dao.Library;
import homework_27.marathon.book_library.dao.LibraryImpl;
import homework_27.marathon.book_library.entity.Book;

import java.util.Arrays;

public class LibraryAppl {

    public static void main(String[] args) {
        Book[] books = new Book[6];

        books[0] = new Book(111_111_111_111_0L, "Faust", "Goethe", 1995);
        books[1] = new Book(111_111_111_111_1L, "The Metamorphosis","Kafka",  1915);
        books[2] = new Book(111_111_111_111_2L, "The Old Man and the Sea","Hemingway", 1952);
        books[3] = new Book(111_111_111_111_3L, "1984","Orwell",  1949);
        books[4] = new Book(111_111_111_111_4L, "The Trial","Kafka", 1990);
        books[5] = new Book(111_111_111_111_5L, "The Castle","Kafka",1990);

        Library library = new LibraryImpl(7);

        // Добавляем книги в библиотеку
        for (int i = 0; i < books.length; i++) {
            library.addBook(books[i]);
        }

        // Печатаем содержимое библиотеки
        library.print();
        System.out.println("--------------------------------------");

        // Добавляем новую книгу
        Book newBook = new Book(111_111_111_111_6L, "War and Peace","Tolstoi", 2000);
        library.addBook(newBook);

        // Печатаем обновленную библиотеку
        library.print();
        System.out.println("--------------------------------------");

        // Удаляем книгу
        library.removeBook(111_111_111_111_6L);
        library.print();
        System.out.println("--------------------------------------");

        // Поиск книги по ISBN
        long isbnToFind = 111_111_111_111_1L;
        Book foundBook = library.findBook(isbnToFind);
        System.out.println("Found book with ISBN " + isbnToFind + ": " + foundBook);
        System.out.println("--------------------------------------");

        // Поиск книг по автору
        String authorToFind = "Kafka";
        Book[] booksByAuthor = library.findBooksByAuthor(authorToFind);
        System.out.println("Books by " + authorToFind + ":");
        library.printBooks(booksByAuthor);
        System.out.println("--------------------------------------");

        // Поиск книг по названию
        String titleToFind = "1984";
        Book[] booksByTitle = library.findBookByTitle(titleToFind);
        System.out.println("Books with title '" + titleToFind + "': ");
        library.printBooks(booksByTitle);
        System.out.println("--------------------------------------");

        // Поиск книг по году издания
        int yearToFind = 1990;
        Book[] booksByYear = library.findBooksByYearOfPublishing(yearToFind);
        System.out.println("Books published in " + yearToFind + ":");
        library.printBooks(booksByYear);
        System.out.println("--------------------------------------");

    }//end of main


    }//end of class


