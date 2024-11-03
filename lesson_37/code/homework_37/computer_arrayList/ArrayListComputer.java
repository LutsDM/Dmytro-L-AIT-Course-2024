package homework_37.computer_arrayList;
//Задача 1. На основе класса Computer:
//
//создать собственный ArrayList;
//добавить в него не менее 6 элементов;
//отсортировать список по бренду;
//отсортировать список по размеру RAM, затем размеру SSD при равенстве RAM;
//подсчитать общий суммарный объем и среднее значение SSD.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListComputer {
    public static void main(String[] args) {

        List<Computer> computerList = new ArrayList<>();

        computerList.add(new Computer("Intel",16,500, "ASUS",2000));
        computerList.add(new Computer("Intel",8,256, "HP",1500));
        computerList.add(new Computer("Intel",16,256, "INTEL",2200));
        computerList.add(new Computer("Intel",32, 500,"ASUS",1200));
        computerList.add(new Computer("Intel",8,500, "FUJITSU",2200));
        computerList.add(new Computer("Intel",16,256, "HP",1200));

        computerList.sort(Computer::compareTo);
        for (Computer computer : computerList) {
            System.out.println(computer);
        }

        Comparator<Computer> comparator = new Comparator<Computer>() {
            @Override
            public int compare(Computer o1, Computer o2) {
                int res = Integer.compare(o1.getRam(), o2.getRam());
                return res !=0 ? res :Integer.compare(o1.getSsd(),o2.getSsd());
            }
        };

        computerList.sort(comparator);
        System.out.println("----------------Sort by Ram and SSD----------------");
        for (Computer computer : computerList) {
            System.out.println(computer);
        }

        System.out.println("----------------------------------------------------");

        int totalSSD = countOfSSD(computerList);
        System.out.println("Total SSD:" + totalSSD);

        int avgSSD = averageOfSSD(computerList);
        System.out.println("Average of SSD: " + avgSSD);
    }

    private static int averageOfSSD(List<Computer> computerList) {
        int avgSSD = 0;
        for (Computer computer : computerList) {
            avgSSD += computer.getSsd();
        }
        return avgSSD/computerList.size();
    }

    private static int countOfSSD(List<Computer> computerList) {
        int totalSSD = 0;
        for (Computer computer : computerList) {
            totalSSD += computer.getSsd();
        }
        return totalSSD;
    }
}
