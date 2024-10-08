package homeWork_18.book.model;
//Создайте класс Book с полями:
//
//уникальный номер ISBN
//название title
//автор author
//год издания yearOfPublishing
//жанр genre
//В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display, который выводит информацию о книге. Создайте конструктор, в котором нет поля ISBN. Создайте конструктор, в котором есть только поля title, author и genre.
public class Book {
    private String iSBN;
    private String title;
    private String author;
    private int yearOfPublishing;
    private String genre;

    public Book(String iSBN, String title, String author, int yearOfPublishing, String genre) {
        this.iSBN = iSBN;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    public Book(String title, String author, int yearOfPublishing, String genre) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getiSBN() {
        return iSBN;
    }

    public void setiSBN(String iSBN) {
        this.iSBN = iSBN;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void displayBook() {
        if (iSBN != null && !iSBN.isEmpty()) {
            if (yearOfPublishing != 0) {
                System.out.printf("Book: ISBN: %s, title: %s, author: %s, genre: %s, yearOfPublishing: %d%n", iSBN, title, author, genre, yearOfPublishing);
            } else {
                System.out.printf("Book: ISBN: %s, title: %s, author: %s, genre: %s%n", iSBN, title, author, genre);
            }
        } else {
            if (yearOfPublishing != 0) {
                System.out.printf("Book: title: %s, author: %s, genre: %s, yearOfPublishing: %d%n", title, author, genre, yearOfPublishing);
            } else {
                System.out.printf("Book: title: %s, author: %s, genre: %s%n", title, author, genre);
            }
        }
    }
}

