package homework_44.book_stream;

import java.util.*;
import java.util.stream.Collectors;

public class BookAppl {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book(111_111_111_111_0L, "Faust", "Goethe", 1995),
                new Book(111_111_111_111_1L, "The Metamorphosis","Kafka",  1915),
                new Book(111_111_111_111_2L, "The Old Man and the Sea","Hemingway", 1952),
                new Book(111_111_111_111_3L, "1984","Orwell",  1949),
                new Book(111_111_111_111_4L, "The Trial","Kafka", 1990),
                new Book(111_111_111_111_5L, "The Castle","Kafka",1990)
        );

        books.stream().forEach(System.out::println);


        System.out.println();
        System.out.println("-----------------all books by Kafka----------------------------");
        books.stream()
                .filter(b -> b.getAuthor().equals("Kafka"))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("-----------------List of author----------------------------");
        List<String> authors = books.stream()
                 .map(Book::getAuthor)
                 .distinct()
                 .sorted()
                 .toList();
        authors.forEach(System.out::println);

        System.out.println();
        System.out.println("-----------------all books after 1985---------------------------");
        books.stream()
                .filter(b -> b.getYearOfPublishing()>1985)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("-----------------sorted by title---------------------------");
        books.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .forEach(System.out::println);


        System.out.println();
        System.out.println("-----------------number of books by author---------------------------");
        Map<String, Long> booksByAuthor = books.stream()
                .map(Book::getAuthor)
                .collect(Collectors.groupingBy(author -> author, Collectors.counting()));

        booksByAuthor.forEach((author, count) -> System.out.println(author + ": " + count));

        System.out.println();
        System.out.println("-----------------earliest and latest published books---------------------------");

        books.stream()
                .min(Comparator.comparing(Book::getYearOfPublishing))
                .ifPresent(b -> System.out.println("Earliest published books: " + b));

        books.stream()
                .max(Comparator.comparing(Book::getYearOfPublishing))
                .ifPresent(b -> System.out.println("Latest published books: " + b));

        System.out.println();
        System.out.println("-----------------is there any books by Orwell?---------------------------");

        boolean hasOrwell = books.stream()
                .anyMatch(b -> b.getAuthor().equals("Orwell"));
        System.out.println("Contains books by Orwell: " + hasOrwell);

        System.out.println();
        System.out.println("-----------------count of books published before 1950---------------------------");

        long countBefore1950 = books.stream()
                .filter(b -> b.getYearOfPublishing() < 1950)
                .count();
        System.out.println("Books published before 1950: " + countBefore1950);

        System.out.println();
        System.out.println("-----------------all books titles in a single string---------------------------");

        String allTitles = books.stream()
                .map(Book::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println("Book titles: " + allTitles);

    }//end of main
}//end of class
