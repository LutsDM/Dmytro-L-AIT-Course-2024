package classWork_23.book_library.controller;

import classWork_23.book_library.model.Book;

public class Library {

    // fields
    private Book[] books;
    private int size; // текущее кол-во книг


    // constructor
    public Library(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }

    // CRUD methods
    public boolean addBook (Book book) {

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
        books[size] = book; //ставим книгу в конец массива, первое свободное место
        size++;
        return true;
    }

   public void printBook() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public Book findBook(long isbn){
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn){
                return books[i];
            }
        }
        return null;
    }

    // Book removeBook(long isbn)
    public Book removeBook(long isbn){
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                Book victim = books[i];
                books[i] = books[size - 1]; //last book put instead victim
                books[size - 1] = null;// затираем последний элемент массива
                size --;
                return victim;
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

} //end of class
