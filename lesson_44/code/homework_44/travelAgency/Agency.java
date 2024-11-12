package homework_44.travelAgency;

import classwork_44.programmer_and_technologies.Programmer;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Какие страны наиболее популярны?
//Кто из клиентов посетил наибольшее количество стран?
public class Agency {
    public static void main(String[] args) {

        List<Tourist> tourists = List.of(
                new Tourist("Name", "C1", "C2", "C3"),
                new Tourist("Olesia", "Iran", "Kyrgystan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain"),
                new Tourist("Bilbo Baggins", "Italy", "Spain", "Turkey"),
                new Tourist("Tatyana", "Italy", "Spain", "Italy", "Greece", "Turkey"),
                new Tourist("Anton", "Germany", "Nederland", "Turkey", "Georgia"),
                new Tourist("Sergei_B", "Tunis", "Turkey", "China", "Vietnam"),
                new Tourist("Galina", "Italy", "France", "Italy"),
                new Tourist("Anatoly", "Montenegro", "Albania", "Greece", "Italy"),
                new Tourist("Andrii", "UK", "Ireland", "Spain"),
                new Tourist("Liubov", "Croatia", "Slovenia", "Spain", "France", "Egypt"),
                new Tourist("Liam", "Spain", "Portugal", "Morocco", "Cyprus"),
                new Tourist("Emma", "Greece", "Turkey", "Croatia", "Montenegro"),
                new Tourist("Mia", "Italy", "Malta", "Spain", "Turkey"),
                new Tourist("Noah", "Turkey", "Greece", "Italy", "Croatia"),
                new Tourist("Olivia", "Croatia", "Montenegro", "Albania", "Greece"),
                new Tourist("Lucas", "Portugal", "Spain", "France", "Italy"),
                new Tourist("Amelia", "Greece", "Cyprus", "Spain", "Italy"),
                new Tourist("Oliver", "Spain", "Italy", "Turkey", "Greece"),
                new Tourist("Isabella", "France", "Spain", "Italy", "Greece"),
                new Tourist("Ethan", "Italy", "Greece", "Spain", "Croatia"),
                new Tourist("Ava", "Greece", "Turkey", "Spain", "Italy"),
                new Tourist("Liam", "Spain", "Italy", "Morocco", "Greece"),
                new Tourist("Sophia", "Italy", "Spain", "Turkey", "Greece"),
                new Tourist("Jackson", "Greece", "Spain", "Italy", "Croatia"),
                new Tourist("Olivia", "Croatia", "Greece", "Italy", "Montenegro"),
                new Tourist("Logan", "Spain", "Greece", "Italy", "Turkey"),
                new Tourist("Emma", "Greece", "Italy", "Spain", "Cyprus"),
                new Tourist("Aiden", "Italy", "Greece", "Spain", "Turkey")
        );

        List<String> mostPopularCountries = findPopularCountry(tourists);
        System.out.println("Top 3 most popular countries:");
        mostPopularCountries.forEach(System.out::println);

        List<Tourist> largestNumberOfCountries = findLargestNumbersOfCountry(tourists);
        System.out.println("\nTop 3 tourists who have visited the largest number of countries:");
        largestNumberOfCountries.forEach(System.out::println);
    }//end of main

    private static List<Tourist> findLargestNumbersOfCountry(List<Tourist> tourists) {
        return tourists.stream()
                .sorted(Comparator.comparingInt((Tourist t) -> t.getCountries().size()).reversed()) // Сортируем по количеству стран, посетивших туристом
                .limit(3) // Берем только топ-3 туристов
                .collect(Collectors.toList());
    }


    private static List<String> findPopularCountry(List<Tourist> tourists) {
        // Подсчитываем частоту посещения каждой страны
        Map<String, Long> countryCount = tourists.stream()
                .flatMap(t -> t.getCountries().stream()) // Разворачиваем список стран всех туристов в один поток
                .collect(Collectors.groupingBy(country -> country, Collectors.counting())); // Группируем и считаем

        // Сортируем по количеству посещений, берем топ-3
        return countryCount.entrySet().stream()
                .sorted((entry1, entry2) -> Long.compare(entry2.getValue(), entry1.getValue())) // Сортируем по частоте
                .limit(3) // Берем только топ-3 страны
                .map(Map.Entry::getKey) // Извлекаем названия стран
                .collect(Collectors.toList()); // Собираем в список
    }
}//end of class
