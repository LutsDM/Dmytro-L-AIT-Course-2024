package homework_27.marathon.book_library.entity;

import java.util.Objects;

public class Book {
    public static final int ISBN_LENGTH = 13;

    private long isbn;
    private String title;
    private String author;
    private int yearOfPublishing;

    public Book(long isbn, String title, String author, int yearOfPublishing) {
        this.isbn = checker(isbn);
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public long checker(long isbn) {
        if (countDigits(isbn)) {
            return isbn;
        }
        return -1;
    }

    public static boolean countDigits(long isbn) {
        int count = 0;
        long temp = isbn;
        while ((temp != 0)) {
            temp = temp / 10;
            count++;
        }
        return count == ISBN_LENGTH;

    }

    public void setIsbn(long isbn) {
        if (checker(isbn) > 0) {
            this.isbn = checker(isbn);
        } else {
            System.out.println("ISBN is not correct.");
        }
    }

    public long getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }
}//end of class
