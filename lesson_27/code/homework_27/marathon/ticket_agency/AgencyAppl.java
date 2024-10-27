package homework_27.marathon.ticket_agency;

import homework_27.marathon.ticket_agency.dao.Agency;
import homework_27.marathon.ticket_agency.dao.AgencyImpl;
import homework_27.marathon.ticket_agency.entity.Airplane;
import homework_27.marathon.ticket_agency.entity.Bus;
import homework_27.marathon.ticket_agency.entity.Ticket;
import homework_27.marathon.ticket_agency.entity.Train;

import java.util.Arrays;

public class AgencyAppl {
    public static void main(String[] args) {

        Agency agency = new AgencyImpl(7);

        Ticket[] tickets = new Ticket[6];


        tickets[0] = new Train("TR2346A-76",56,"16-12-2024","Berlin",120,"ICE7", true,false);
        tickets[1] = new Train("TR878A-109",56,"16-12-2024","Dortmund",100,"ICE55", true,true);
        tickets[2] = new Airplane("AI9837G-99", 84,"29-12-2024","Berlin", 95,"LH 119", true, false);
        tickets[3] = new Airplane("AI7645G-11", 84,"01-12-2024","Dortmund", 155,"LH 201", false, true);
        tickets[4] = new Bus("BU8736L-80",32,"16-12-2024","Dortmund", 85, "DB1524F",true);
        tickets[5] = new Bus("BU7464L-60",32,"16-12-2024","Berlin", 105, "Af5684F",false);

        for (int i = 0; i < 6; i++) {
            agency.addTicket(tickets[i]);
        }

        System.out.println("All tickets in the agency:");
        agency.printTicket();

        System.out.println("\nTotal quantity of tickets: " + agency.quantity());
        System.out.println("----------------------------");

        // Добавление нового билета
        Ticket newTicket = new Train("TR1111A-100", 70, "18-12-2024", "Munich", 130, "ICE8", true, true);
        agency.addTicket(newTicket);

        System.out.println("After adding a new ticket:");
        agency.printTicket();

        System.out.println("----------------------------");

        // Обновление существующего билета
        Ticket updatedTicket = new Train("TR2346A-76", 65, "16-12-2024", "Berlin", 120, "ICE7", true, true);
       agency.updateTicket(updatedTicket);

        System.out.println("After updating an existing ticket:");
        agency.printTicket();

        System.out.println("----------------------------");

        // Поиск билетов по месту отправления
        System.out.println("Tickets departing from 'Berlin':");
        Ticket[] berlinTickets = agency.findTicketsByDepartureLocation("Berlin");
        for (Ticket ticket : berlinTickets) {
            System.out.println(ticket);
        }

        System.out.println("----------------------------");

        // Удаление билета по номеру
        System.out.println("\nRemoving ticket with number 'TR878A-109':");
        agency.removeTicket("TR878A-109");
        agency.printTicket();

        System.out.println("----------------------------");

        // Поиск билета с минимальной стоимостью
        Ticket minCostTicket = agency.findTicketByMinCost();
        System.out.println("Ticket with minimum cost: " + minCostTicket);

        // Поиск билета с минимальным временем в пути
        Ticket minTimeTicket = agency.findTicketByMinTravelTime();
        System.out.println("Ticket with minimum travel time: " + minTimeTicket);

        // Общая стоимость всех билетов
        System.out.println("Total cost of all tickets: " + agency.totalCost());
    }

}
