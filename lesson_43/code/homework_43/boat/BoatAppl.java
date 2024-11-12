package homework_43.boat;



import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//отобразить все яхты;
//отобразить яхты, сделанные из указанного материала корпуса;
//отобразить яхты дороже указанной цены;
//отобразить яхты, чей год выпуска находится в заданном диапазоне;
//отсортировать яхты в порядке убывания стоимости;
//получить среднюю стоимость яхты из созданного набора;
//сколько и конкретно какие яхты под каким флагом стоят в порту.
public class BoatAppl {
    public static void main(String[] args) {

        List<Boat> boats = Arrays.asList(
                new Boat("Atlantis Shipyard", "Spain", 2010, "Steel", 500_000.00),
                new Boat("Coral Reef Shipyard", "USA", 2015, "Aluminum", 750_000.00),
                new Boat("Oasis Marine Works", "USA", 2018, "Wood", 400_000.00),
                new Boat("Nautical Builders", "Spain", 2012, "Fiberglass", 300_000.00),
                new Boat("Oceanic Engineering", "Norway", 2020, "Carbon Fiber", 100_000_0.00),
                new Boat("Blue Wave Shipyard", "Norway", 2017, "Steel", 650_000.00),
                new Boat("Seaside Boatworks", "Spain", 2014, "Aluminum", 550_000.00),
                new Boat("Stormbreaker Shipyard", "Spain", 2019, "Wood", 450_000.00)
        );

        boats.stream().forEach(System.out::println);

        System.out.println();
        System.out.println("-----------------all boats from wood----------------------------");
        boats.stream().filter(b -> b.getMaterial().equals("Wood")).forEach(System.out::println);

        System.out.println();
        System.out.println("-----------------all boats more than 450_000---------------------------");
        boats.stream().filter(b -> b.getCost() > 450000.00).forEach(System.out::println);

        System.out.println();
        System.out.println("-----------------all boats year from 2014 to 2019---------------------------");
        boats.stream().filter(b -> b.getYear() > 2014).forEach(System.out::println);

        System.out.println();
        System.out.println("-----------------all boats are sorted by descending cost---------------------------");
        boats.stream().sorted(Comparator.comparing(Boat::getCost).reversed()).forEach(System.out::println);

        System.out.println();
        System.out.println("-----------------average cost of spanish boats---------------------------");
        double averageCost = boats.stream()
                .filter(b -> b.getCountry().equals("Spain"))
                .mapToDouble(Boat::getCost)
                .average()
                .orElse(0.0);

        System.out.println("Average cost of Spanish yachts: " + averageCost);

        System.out.println();
        System.out.println("-----------------boats by flag---------------------------");
        Map<String, List<Boat>> boatsByFlag = boats.stream()
                .collect(Collectors.groupingBy(Boat::getCountry));

        for (String country : boatsByFlag.keySet()) {
            System.out.println("Country: " + country + " , boats: " + boatsByFlag.get(country).size());
        }







    }
}
