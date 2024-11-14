package homework_35.time.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class DateOperation {

//  Этот метод принимает дату рождения в виде стринга,
//    и возвращающий возраст.

    public static int getAge(String birthDate) {
        LocalDate parsDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]"));
        long age = ChronoUnit.YEARS.between(parsDate, LocalDate.now());

        return (int) age;
    }


    public static String[] sortStringDates(String[] dates) {
        OriginalLocal[] datePairs = new OriginalLocal[dates.length];
        DateTimeFormatter parsDate = DateTimeFormatter.ofPattern("[yyyy-MM-dd][dd/MM/yyyy]");

        for (int i = 0; i < dates.length; i++) {
            LocalDate localDate = LocalDate.parse(dates[i], parsDate);
            datePairs[i] = new OriginalLocal(localDate, dates[i]); // Сохраняем оригинальную строку
        }

        Arrays.sort(datePairs); // Сортируем по LocalDate

        String[] sortedDates = new String[datePairs.length];
        for (int i = 0; i < datePairs.length; i++) {
            sortedDates[i] = datePairs[i].originalDate; // Возвращаем оригинальные строки
        }

        return sortedDates;
    }

    private static class OriginalLocal implements Comparable<OriginalLocal> {
        LocalDate date;
        String originalDate;

        OriginalLocal(LocalDate date, String originalDate) {
            this.date = date;
            this.originalDate = originalDate;
        }

        @Override
        public int compareTo(OriginalLocal o) {
            return this.date.compareTo(o.date); // Сравнение по LocalDate
        }

    }
}
