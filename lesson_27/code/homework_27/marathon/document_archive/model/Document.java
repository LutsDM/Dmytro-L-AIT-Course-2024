package homework_27.marathon.document_archive.model;

import java.time.LocalDate;
import java.util.Objects;

public class Document {

    public static final int ID_LENGTH = 10;


    private long id;
    private String title;
    private String author;
    private int yearsOfCreate;

    public Document(long id, String title, String author, int yearsOfCreate) {
        this.id = checkId(id);
        this.title = title;
        this.author = author;
        this.yearsOfCreate = checkYears(yearsOfCreate); // проверка валидности года
    }


    private long checkId(long id) {
        if (countDigit(id)) {
            return id;

        }
        return -1;

    }

    private boolean countDigit (long id) {
        int count = 0;
        long temp = id;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        return count == ID_LENGTH;
    }

    private int checkYears (int yearsOfCreate) {
        //задаем диапазон года создания от 1500 года до текущего
        int currentYear = LocalDate.now().getYear();
        if (yearsOfCreate >= 1500 && yearsOfCreate <= currentYear) {
            return yearsOfCreate;
        } else {
            return -1;  // Некорректный год
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
       if (checkId(id) > 0) {
           this.id = checkId(id);
       } else {
           System.out.println("id is not correct.");
       }
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

    public int getYearsOfCreate() {
        return yearsOfCreate;
    }

    public void setYearsOfCreate(int yearsOfCreate) {
        if (checkYears(yearsOfCreate) > 0) {
            this.yearsOfCreate = checkYears(yearsOfCreate);
        } else {
            System.out.println("Years is not correct.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document document)) return false;
        return id == document.id && yearsOfCreate == document.yearsOfCreate && Objects.equals(title, document.title) && Objects.equals(author, document.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, yearsOfCreate);
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearsOfCreate=" + yearsOfCreate +
                '}';
    }
}//end of class
