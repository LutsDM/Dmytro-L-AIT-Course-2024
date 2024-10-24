package homework_30;
//Задание 3.(*) В классе DateSortTest (см. код занятия), реализовать компаратор в методе setUp, чтобы тест был верный. Просьба не использовать Java Time API.

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class DateSortTest {
    Comparator<String> comparator;

    @BeforeEach
    void setUp() {
        comparator = (s1, s2) -> {
            int yearComparison = Integer.parseInt(s1.substring(6, 10)) - Integer.parseInt(s2.substring(6, 10));
            if(yearComparison !=0 ) {
                return yearComparison;
            }

            int monthComparison =  Integer.parseInt(s1.substring(3, 5)) - Integer.parseInt(s2.substring(3, 5));
            if(monthComparison !=0 ) {
                return monthComparison;
            }

            return Integer.parseInt(s1.substring(0, 2)) - Integer.parseInt(s2.substring(0, 2));

        };
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        Arrays.sort(dates, comparator);
        assertArrayEquals(expected, dates);
    }
}
