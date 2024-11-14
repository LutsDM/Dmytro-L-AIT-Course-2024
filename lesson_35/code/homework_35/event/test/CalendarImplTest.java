package homework_35.event.test;

import homework_35.event.dao.Calendar;
import homework_35.event.dao.CalendarImpl;
import homework_35.event.model.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CalendarImplTest {

    Calendar calendar;
    Event[] events;

    LocalDate now = LocalDate.now();

    Comparator<Event> comparator = (e1, e2) -> {
        return Integer.compare(e1.getId(), e2.getId());
    };

    @BeforeEach
    void setUp() {

        calendar = new CalendarImpl(6);

        events = new Event[5];

        events[0] = new Event(1,"t1","url1",now.minusDays(2));
        events[1] = new Event(2,"t2","url2",now.minusDays(4));
        events[2] = new Event(3,"t3","url3",now.minusDays(5));
        events[3] = new Event(4,"t4","url4",now.minusDays(2));
        events[4] = new Event(5,"t5","url5",now.minusDays(1));

        for (int i = 0; i < 5; i++) {
            calendar.addEvent(events[i]);
        }


    }


    @Test
    void addEventTest() {
        assertFalse(calendar.addEvent(null));
        assertFalse(calendar.addEvent(events[2]));
        Event newEvent = new Event(6,"t6","url6",now.minusDays(6));
        assertTrue(calendar.addEvent(newEvent));
        assertEquals(6, calendar.size());
        Event oneMoreEvent = new Event(7,"t7","url7",now.minusDays(6));
        assertFalse(calendar.addEvent(oneMoreEvent));
    }

    @Test
    void removeEventTest() {
        assertTrue(calendar.removeEvent(1));
        assertFalse(calendar.removeEvent(8));
        assertEquals(4, calendar.size());
    }

    @Test
    void updateEventTest() {
        assertTrue(calendar.updateEvent(5, "t55","url5555"));
        assertEquals("t55", calendar.findEvent(5).getTitle());
        assertEquals("url5555", calendar.findEvent(5).getUrl());
    }

    @Test
    void findEventTest() {
        assertEquals(events[3],calendar.findEvent(4));
        assertNull(calendar.findEvent(9));
    }

    @Test
    void getEventBetweenDateTest() {
    LocalDate today = LocalDate.now();
    Event[] actual = calendar.getEventBetweenDate(today.minusDays(1),today.minusDays(4));
    Arrays.sort(actual, comparator);
    Event[] expected = {events[0],events[3],events[4]};
    Arrays.sort(expected, comparator);
    assertEquals(actual,expected);
    }

    @Test
    void printEventTest() {
        calendar.printEvent();
    }

    @Test
    void sizeTest() {
        assertEquals(5, calendar.size());
    }
}