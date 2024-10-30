package homework_35.event.dao;

import homework_35.event.model.Event;

import java.time.LocalDate;

public interface Calendar {

    boolean addEvent (Event event);
    boolean removeEvent (int id);
    boolean updateEvent (int id, String title, String url);
    Event findEvent (int id);
    Event[] getEventBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    void printEvent();
    int size();

}
