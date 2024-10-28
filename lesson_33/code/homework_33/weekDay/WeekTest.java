package homework_33.weekDay;


import classwork_33.season.Season;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekTest {

    @Test
    void valuesTest() {
        Week[] expected = {
                Week.MONDAY, Week.TUESDAY, Week.WEDNESDAY, Week.THURSDAY,
                Week.FRIDAY, Week.SATURDAY, Week.SUNDAY
        };
        Week[] actual = Week.values();
        assertArrayEquals(expected, actual);
    }

    @Test
    void toStringTest() {
        Week monday = Week.MONDAY;
        String expected = "Week{name='Понедельник', number=1, isWeekend=false}";
        assertEquals(expected, monday.toString());
    }

    @Test
    void ordinalTest() {
        assertEquals(0, Week.MONDAY.ordinal());
        assertEquals(1, Week.TUESDAY.ordinal());
        assertEquals(5, Week.SATURDAY.ordinal());
        assertEquals(6, Week.SUNDAY.ordinal());
    }

    @Test
    void valueOfTest() {
        assertEquals(Week.WEDNESDAY, Week.valueOf("WEDNESDAY"));
        assertEquals(Week.SUNDAY, Week.valueOf("SUNDAY"));
    }

    @Test
    void plusDayTest() {
        assertEquals(Week.TUESDAY, Week.MONDAY.plusDay(1));
        assertEquals(Week.FRIDAY, Week.TUESDAY.plusDay(3));
        assertEquals(Week.SUNDAY, Week.SUNDAY.plusDay(0));
    }



}
