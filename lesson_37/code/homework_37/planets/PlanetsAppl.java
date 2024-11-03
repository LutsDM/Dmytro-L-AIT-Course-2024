package homework_37.planets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//Задача 2. Занести планеты солнечной системы в список, содержащий:
//
//наименование;
//расстояние до Солнца;
//массу;
//количество спутников.
//Вывести список планет отсортированный по:
//
//порядку расположения в солнечной системе;
//алфавиту;
//массе;
//количеству спутников.
public class PlanetsAppl {
    public static void main(String[] args) {
        List<Planets> planetsList = new ArrayList<>();

        planetsList.add(new Planets("Mercury", 57.91, 0.330, 0));
        planetsList.add(new Planets("Venus", 108.2, 4.87, 0));
        planetsList.add(new Planets("Earth", 149.6, 5.97, 1));
        planetsList.add(new Planets("Mars", 227.9, 0.642, 2));
        planetsList.add(new Planets("Jupiter", 778.5, 1898, 79));
        planetsList.add(new Planets("Saturn", 1439, 568, 83));
        planetsList.add(new Planets("Uranus", 2871, 86.8, 27));
        planetsList.add(new Planets("Neptune", 4497, 102, 14));

        planetsList.sort(Planets::compareTo);

        System.out.println("-----------------sort by distance----------------");
        for (Planets planets : planetsList) {
            System.out.println(planets);
        }

        Comparator<Planets> comparator = new Comparator<Planets>() {
            @Override
            public int compare(Planets o1, Planets o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        planetsList.sort(comparator);
        System.out.println("-------------------sort by alphabet-----------------");
        for (Planets planets : planetsList) {
            System.out.println(planets);
        }

        Comparator<Planets> comparatorWeight = new Comparator<Planets>() {
            @Override
            public int compare(Planets o1, Planets o2) {
                return Double.compare(o1.getWeight(), o2.getWeight());
            }
        };

        planetsList.sort(comparatorWeight);
        System.out.println("-------------------sort by weight-----------------");
        for (Planets planets : planetsList) {
            System.out.println(planets);
        }

        Comparator<Planets> comparatorNumbersOfSputnik = new Comparator<Planets>() {
            @Override
            public int compare(Planets o1, Planets o2) {
                return Double.compare(o1.getNumbersOfSputnik(), o2.getNumbersOfSputnik());
            }
        };

        planetsList.sort(comparatorNumbersOfSputnik);
        System.out.println("-------------------sort by numbers of sputnik-----------------");
        for (Planets planets : planetsList) {
            System.out.println(planets);
        }
    }
}
