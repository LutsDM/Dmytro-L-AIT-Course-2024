
package homework_27.marathon.book_library.dao;

import homework_27.marathon.book_library.entity.Book;

import java.util.function.Predicate;

public class LibraryImpl implements Library {

    private Book[] books;
    private int size;

    public LibraryImpl(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }

    @Override
    public boolean addBook(Book book) {

        //negative cases
        if(book == null) {
            return false;
        }
        if(size == books.length){
            return false;
        }
        if (!(findBook(book.getIsbn()) == null)){
            return false;
        }

        //positive case
        books[size++] = book;
        return true;
    }

    @Override
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                Book victim = books[i];
                books[i] = books[size - 1];
                books[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn){
                return books[i];
            }
        }
        return null;
    }

    @Override
    public Book[] findBooksByAuthor(String author) {
        return findBookByPredicate(book -> book.getAuthor().equals(author));

    }

    @Override
    public Book[] findBooksByYearOfPublishing(int yearOfPublishing) {
        return findBookByPredicate(book -> book.getYearOfPublishing() == yearOfPublishing);
    }

    @Override
    public Book[] findBookByTitle(String title) {
        return findBookByPredicate(book -> book.getTitle().equals(title));
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    @Override
    public void printBooks(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    @Override
    public int size() {
        return size;
    }


    private Book[] findBookByPredicate (Predicate<Book> predicate) {
        int count  = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(books[i])) {
                count++;
            }
        }

        Book[] res = new Book[count];
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(predicate.test(books[i])){
                res[j++] = books[i];
            }
        }
        return res;

    }
}// end of class

