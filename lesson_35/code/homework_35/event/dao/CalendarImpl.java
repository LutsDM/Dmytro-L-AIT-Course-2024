package homework_35.event.dao;

import ait.employee.model.Employee;
import classwork_35.ait.album.model.Photo;
import homework_35.event.model.Event;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class CalendarImpl implements Calendar {

    private Event[] events;
    private int size;

    public CalendarImpl(int capacity) {
        this.events = new Event[capacity];
        this.size = 0;
    }

    Comparator<Event> comparator = (e1, e2) -> {
        return Integer.compare(e1.getId(), e2.getId());
    };

    @Override
    public boolean addEvent(Event event) {
        if(event == null || size == events.length){
            return false;
        }
        if(findEvent(event.getId()) != null){
            return false;
        }

        int index = Arrays.binarySearch(events,0, size, event, comparator);
        index = index >= 0 ? index : - index -1;
        System.arraycopy(events,index,events,index + 1,size - index);
        events[index] = event;
        size++;
        return true;
    }

    @Override
    public boolean removeEvent(int id) {
        for (int i = 0; i < size; i++) {
            if(events[i].getId() == id) {
                System.arraycopy(events,i + 1, events, i, size -i -1);
                events[--size]=null;
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean updateEvent(int id, String title, String url) {
        Event event = findEvent(id);
        if(event == null){
            return false;
        }
        event.setUrl(url);
        event.setTitle(title);
        return true;
    }

    @Override
    public Event findEvent(int id) {
        for (int i = 0; i < size; i++) {
            if(events[i].getId() == id) {
                return events[i];
            }
        }
        return null;
    }

    @Override
    public Event[] getEventBetweenDate(LocalDate dateFrom, LocalDate dateTo) {

        //мне кажется направление правильное, но не допилил

        return null;//findEventByPredicate(event -> event.getDate().compareTo(dateFrom) && event.getDate().compareTo
         //(dateTo));
    }

    @Override
    public void printEvent() {
        for (int i = 0; i < size; i++) {
            System.out.println(events[i]);
        }
    }

    @Override
    public int size() {
        return size;
    }

    private Event[] findEventByPredicate(Predicate<Event> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(events[i])) {
                count++;
            }
        }

        Event[] res = new Event[count];
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(predicate.test(events[i])){
                res[j++] = events[i];
            }
        }
        return res;
    }
}
