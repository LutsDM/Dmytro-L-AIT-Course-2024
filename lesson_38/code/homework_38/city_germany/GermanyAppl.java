package homework_38.city_germany;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class GermanyAppl {
    public static void main(String[] args) {
        LinkedList<String> city = new LinkedList<>(List.of("Stuttgart", "Munich", "Berlin", "Potsdam", "Bremen",
                "Wiesbaden", "Hanover", "Schwerin", "Düsseldorf", "Mainz", "Saarbrücken", "Dresden", "Magdeburg", "Kiel",
                "Erfurt"));

        System.out.println("=================original list==================");
        System.out.println(city);

        System.out.println("=================add Hamburg last==================");
        city.add("Hamburg"); //addLast дублирует базовый add
        System.out.println(city);
        System.out.println();

        System.out.println("=================add Hamburg first==================");
        city.addFirst("Hamburg");
        System.out.println(city);
        System.out.println();

        System.out.println("=================add Hamburg in the middle ==================");
        city.add(city.size()/2, "Hamburg");
        System.out.println(city);
        System.out.println();

        System.out.println("Get first: " + city.getFirst());

        System.out.println("Get last: " + city.getLast());

        System.out.println("Get by index 2: " + city.get(2));

        System.out.println("=================Remove Object 'Hamburg'==================");
        city.remove("Hamburg"); //удаляет первый
        System.out.println(city);
        System.out.println();

        System.out.println("=================Remove by index 2==================");
        city.remove(2);
        System.out.println(city);
        System.out.println();

        System.out.println("Get Bremen index : " + city.indexOf("Bremen"));
        System.out.println();

        System.out.println("===============sort alphabetically====================");
        city.sort(String::compareTo);
        System.out.println(city);
        System.out.println();

        System.out.println("===============sort alphabetically from the end==================");
        city.sort(Comparator.reverseOrder());
        System.out.println(city);

    }// end of main
    }//end of class


