package homework_27.marathon.ticket_agency.dao;

import classwork_32.ait.employee.model.Employee;
import homework_27.marathon.ticket_agency.entity.Ticket;

public interface Agency {

    boolean addTicket(Ticket ticket);

    Ticket updateTicket(Ticket ticket);

    Ticket removeTicket(String ticketNumber);

    Ticket findTicket (String ticketNumber);

    int quantity();

    void printTicket();

    double totalCost();

    Ticket findTicketByMinCost();

    Ticket findTicketByMinTravelTime();

    Ticket[] findTicketsByDepartureLocation(String departureLocation);

    Ticket[] findTicketsByDepartureDate(String departureDate);

}
