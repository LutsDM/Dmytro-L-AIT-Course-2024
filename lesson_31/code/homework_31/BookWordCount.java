package homework_31;

import java.util.Objects;

public class BookWordCount implements Comparable <BookWordCount> {

    private String name;
    private int wordCount;

    public BookWordCount(String name, int wordCount) {
        this.name = name;
        this.wordCount = wordCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookWordCount that)) return false;
        return wordCount == that.wordCount && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, wordCount);
    }

    @Override
    public String toString() {
        return String.format("Book title: %s, count of words: %d", name, wordCount);
    }

    @Override
    public int compareTo(BookWordCount o) {
        return this.getWordCount() - o.getWordCount();
    }
}
