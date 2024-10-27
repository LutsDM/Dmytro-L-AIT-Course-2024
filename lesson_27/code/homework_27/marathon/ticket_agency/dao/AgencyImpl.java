package homework_27.marathon.ticket_agency.dao;

import homework_27.marathon.ticket_agency.entity.Ticket;

import java.util.Arrays;
import java.util.function.Predicate;

public class AgencyImpl implements Agency {

    Ticket[] tickets ;
    int size;

    public AgencyImpl(int capacity) {
        this.tickets = new Ticket[capacity];
        this.size = 0;
    }


    @Override
    public boolean addTicket (Ticket ticket) {
        if (ticket == null) {
            return false;
        }
        if (size == tickets.length) {
            return false;
        }
        if (!(findTicket(ticket.getTicketNumber()) == null)) {
            return false;
        }

        tickets[size] = ticket;
        size++;
        return true;
    }

    @Override
    public Ticket updateTicket(Ticket ticket) {
        for (int i = 0; i < size; i++) {
            if(tickets[i].getTicketNumber() == ticket.getTicketNumber()){
                tickets[i] = ticket;
                return tickets[i];
            }

        }
        return null;
    }

    @Override
    public Ticket removeTicket(String ticketNumber) {
        for (int i = 0; i < size; i++) {
            if(tickets[i].getTicketNumber() == ticketNumber){
                Ticket victim = tickets[i];
                tickets[i] = tickets[size - 1];
                tickets[size -1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Ticket findTicket(String ticketNumber) {
        for (int i = 0; i < size; i++) {
            if(tickets[i].getTicketNumber() == ticketNumber) {
                return tickets[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printTicket() {
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }

    }

    @Override
    public double totalCost() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += tickets[i].calcCost();
        }
        return total;
    }

    @Override
    public Ticket findTicketByMinCost() {
        Ticket minCostTicket = tickets[0];
        double minCost = minCostTicket.calcCost();
        for (int i = 0; i < size; i++) {
            if(tickets[i].calcCost() < minCost) {
                minCost = tickets[i].calcCost();
                minCostTicket = tickets[i];
            }
        }
        return minCostTicket;
    }

    @Override
    public Ticket findTicketByMinTravelTime() {
        Ticket minTimeTicket = tickets[0];
        int minTime = minTimeTicket.getTravelTime();
        for (int i = 0; i < size; i++) {
            if(tickets[i].getTravelTime() < minTime){
            minTime = tickets[i].getTravelTime();
            minTimeTicket = tickets[i];
            }
        }

        return minTimeTicket;
    }

    @Override
    public Ticket[] findTicketsByDepartureLocation(String departureLocation) {
        return findDocumentByPredicate(ticket -> ticket.getDepartureLocation().equals(departureLocation));
    }


    @Override
    public Ticket[] findTicketsByDepartureDate(String departureDate) {
        return findDocumentByPredicate(ticket -> ticket.getDepartureDate().equals(departureDate));
    }

    private Ticket[] findDocumentByPredicate (Predicate<Ticket> predicate) {
        int count  = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(tickets[i])) {
                count++;
            }
        }

        Ticket[] res = new Ticket[count];
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(predicate.test(tickets[i])){
                res[j++] = tickets[i];
            }
        }
        return res;

    }

}
