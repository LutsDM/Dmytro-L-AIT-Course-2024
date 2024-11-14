package homework_42;

import java.util.HashMap;
import java.util.Map;

//Задание 1. Соберите в структуру Map порядка 20 стран, по несколько стран из разных континентов Земли. Подсчитайте
// количество стран на континентах из полученного списка.//
public class Country {
    public static void main(String[] args) {

        Map<String ,String> countryMap = new HashMap<>();

        countryMap.put("Italy", "Europa");
        countryMap.put("USA", "North America");
        countryMap.put("China", "Asia");
        countryMap.put("Egypt", "Africa");
        countryMap.put("Brazil", "South America");
        countryMap.put("Australia", "Oceania");
        countryMap.put("Russia", "Asia");
        countryMap.put("India", "Asia");
        countryMap.put("Canada", "North America");
        countryMap.put("Argentina", "South America");
        countryMap.put("Kenya", "Africa");
        countryMap.put("Japan", "Asia");
        countryMap.put("New Zealand", "Oceania");
        countryMap.put("South Africa", "Africa");


        Map<String, Integer> result = new HashMap<>();

        for (String continentName : countryMap.values()) {
            if (!result.containsKey(continentName)) {
                result.put(continentName, 1);
            } else {
                result.put(continentName, result.get(continentName) + 1);
            }
        }

        for (String s : result.keySet()) {
            System.out.println("Continent: " + s + ", frequency: " + result.get(s));
        }



        }//end of main


    }//end of class

