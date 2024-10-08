package homeWork_18.book.model;

public class Dictionary extends Book {

    private String subjectArea;             //linguistics, medical, legal, technical
    private String language;                //the language in which the dictionary is written.
    private int numberOfEntries;            //the total number of words or phrases.

    public Dictionary(String iSBN, String title, String author, int yearOfPublishing, String genre, String subjectArea, String language, int numberOfEntries) {
        super(iSBN, title, author, yearOfPublishing, genre);
        this.subjectArea = subjectArea;
        this.language = language;
        this.numberOfEntries = numberOfEntries;
    }

    public Dictionary(String title, String author, int yearOfPublishing, String genre, String subjectArea, String language, int numberOfEntries) {
        super(title, author, yearOfPublishing, genre);
        this.subjectArea = subjectArea;
        this.language = language;
        this.numberOfEntries = numberOfEntries;
    }

    public Dictionary(String title, String author, String genre, String subjectArea, String language, int numberOfEntries) {
        super(title, author, genre);
        this.subjectArea = subjectArea;
        this.language = language;
        this.numberOfEntries = numberOfEntries;
    }

    public String getSubjectArea() {
        return subjectArea;
    }

    public void setSubjectArea(String subjectArea) {
        this.subjectArea = subjectArea;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public void setNumberOfEntries(int numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "subjectArea='" + subjectArea + '\'' +
                ", language='" + language + '\'' +
                ", numberOfEntries=" + numberOfEntries +
                "} " + super.toString();
    }

    @Override
    public void displayBook() {
        if (getiSBN() != null && !getiSBN().isEmpty()) {
            if (getYearOfPublishing() != 0) {
                System.out.printf("Book: ISBN: %s, title: %s, author: %s, genre: %s, yearOfPublishing: %d, " + "subjectArea: %s, language: %s, numberOfEntries: %s%n", getiSBN(), getTitle(), getAuthor(), getGenre(), getYearOfPublishing(), subjectArea, language, numberOfEntries);
            } else {
                System.out.printf("Book: ISBN: %s, title: %s, author: %s, genre: %s, subjectArea: %s, language: %s, numberOfEntries: %s%n", getiSBN(), getTitle(), getAuthor(), getGenre(), subjectArea, language, numberOfEntries);
            }
        } else {
            if (getYearOfPublishing() != 0) {
                System.out.printf("Book: title: %s, author: %s, genre: %s, yearOfPublishing: %d, subjectArea: %s, language: %s, numberOfEntries: %s%n", getTitle(), getAuthor(), getGenre(), getYearOfPublishing(), subjectArea, language, numberOfEntries);
            } else {
                System.out.printf("Book: title: %s, author: %s, genre: %s, subjectArea: %s, language: %s, " + "numberOfEntries: %s%n", getTitle(), getAuthor(), getGenre(), subjectArea, language, numberOfEntries);
            }
        }
    }
}
