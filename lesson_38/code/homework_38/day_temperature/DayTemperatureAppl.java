package homework_38.day_temperature;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DayTemperatureAppl {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        ArrayList<DayTemperature> lastWeekOсtober = new ArrayList<>(List.of(
                new DayTemperature(now.minusDays(14), 10),
                new DayTemperature(now.minusDays(13), 12.5),
                new DayTemperature(now.minusDays(12), 8.5),
                new DayTemperature(now.minusDays(11), 15),
                new DayTemperature(now.minusDays(10), 14.5),
                new DayTemperature(now.minusDays(9), 10),
                new DayTemperature(now.minusDays(8), 11.5)
        ));

        ArrayList<DayTemperature> firstWeekNovember = new ArrayList<>(List.of(
                new DayTemperature(now.minusDays(7), 9.5),
                new DayTemperature(now.minusDays(6), 9),
                new DayTemperature(now.minusDays(5), 8),
                new DayTemperature(now.minusDays(4), 10.5),
                new DayTemperature(now.minusDays(3), 11),
                new DayTemperature(now.minusDays(2), 8.5),
                new DayTemperature(now.minusDays(1), 9)

        ));

        ArrayList<DayTemperature> endOfOctoberBeginNovember = new ArrayList<>(lastWeekOсtober);
        endOfOctoberBeginNovember.addAll(firstWeekNovember);

        endOfOctoberBeginNovember.sort(comparatorTemp);

        System.out.println("Day of minimal temperature: " + endOfOctoberBeginNovember.get(0));
        System.out.println("Day of maximal temperature: " + endOfOctoberBeginNovember.get(endOfOctoberBeginNovember.size() - 1));

        // или так еще работает
        // System.out.println("Day of minimal temperature: " + endOfOctoberBeginNovember.getFirst());
        // System.out.println("Day of maximal temperature: " + endOfOctoberBeginNovember.getLast());

        Double averageTemperature = calculatingAverageTemperature(endOfOctoberBeginNovember);

        System.out.println("Average temperature last week of October and first week of November:  " + averageTemperature);

    }

    private static Double calculatingAverageTemperature(ArrayList<DayTemperature> endOfOctoberBeginNovember) {
        double sum = 0;

        for (DayTemperature t : endOfOctoberBeginNovember) {
        sum += t.getTemperature();
        }
        double average = sum / endOfOctoberBeginNovember.size();
        return Math.round(average * 100.0) / 100.0;
    }

    private static Comparator<DayTemperature> comparatorTemp = new Comparator<DayTemperature>() {
        @Override
        public int compare(DayTemperature o1, DayTemperature o2) {
            return Double.compare(o1.getTemperature(),o2.getTemperature());
        }
    };


}
