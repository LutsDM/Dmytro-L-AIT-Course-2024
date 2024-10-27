package homework_27.marathon.ticket_agency.test;

import homework_27.marathon.ticket_agency.dao.Agency;
import homework_27.marathon.ticket_agency.dao.AgencyImpl;
import homework_27.marathon.ticket_agency.entity.Airplane;
import homework_27.marathon.ticket_agency.entity.Bus;
import homework_27.marathon.ticket_agency.entity.Ticket;
import homework_27.marathon.ticket_agency.entity.Train;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgencyImplTest {

    Agency agency;
    Ticket[] tickets;



    @BeforeEach
    void setUp() {
        agency = new AgencyImpl(7);
        tickets = new Ticket[6];

        tickets[0] = new Train("TR2346A-76",56,"16-12-2024","Berlin",120,"ICE7", true,false);
        tickets[1] = new Train("TR878A-109",56,"16-12-2024","Dortmund",100,"ICE55", true,true);
        tickets[2] = new Airplane("AI9837G-99", 84,"29-12-2024","Berlin", 95,"LH 119", true, false);
        tickets[3] = new Airplane("AI7645G-11", 84,"01-12-2024","Dortmund", 155,"LH 201", false, true);
        tickets[4] = new Bus("BU8736L-80",32,"16-12-2024","Dortmund", 85, "DB1524F",true);
        tickets[5] = new Bus("BU7464L-60",32,"16-12-2024","Berlin", 105, "Af5684F",false);

        for (int i = 0; i < 6; i++) {
            agency.addTicket(tickets[i]);
        }

    }

    @Test
    void addTicketTest() {
        assertEquals(6, agency.quantity());
        assertFalse(agency.addTicket(null));
        assertFalse(agency.addTicket(tickets[3]));
        Ticket newTicket = new Bus("BU8736L-80",32,"16-12-+2024","Berlin", 85, "DB1524F",true);
        assertTrue(agency.addTicket(newTicket));
        assertEquals(7, agency.quantity());
        Ticket oneMoreTicket = new Bus("BU87sc36L-80",32,"16-12-+2024","Dortmund", 85, "DB1524F",true);
        assertFalse(agency.addTicket(oneMoreTicket));
    }

    @Test
    void removeTicketTest() {
        assertEquals(tickets[1], agency.removeTicket("TR878A-109"));
        assertEquals(5, agency.quantity());

    }

    @Test
    void updateTicket() {
        Ticket updateTicket = new Bus("BU7464L-60",32,"02-12-2024","Dortmund", 105, "Af5684F",false);
        agency.updateTicket(updateTicket).getDepartureDate();
        assertEquals("02-12-2024",agency.updateTicket(updateTicket).getDepartureDate());
    }

    @Test
    void findTicketTest() {
        assertEquals(tickets[2], agency.findTicket("AI9837G-99"));
        assertNull(agency.findTicket("AI943837G-99"));
    }

    @Test
    void quantityTest() {
        assertEquals(6, agency.quantity());
    }

    @Test
    void printTicketTest() {
        agency.printTicket();
    }

    @Test
    void totalCostTest() {
        assertEquals(427.68, agency.totalCost());

    }

    @Test
    void findTicketByMinCostTest() {
        assertEquals(tickets[5], agency.findTicketByMinCost());
    }

    @Test
    void findTicketByMinTravelTimeTest() {
        assertEquals(tickets[4], agency.findTicketByMinTravelTime());
    }

    @Test
    void findTicketsByDepartureLocationTest() {
        Ticket[] expected = {tickets[1], tickets[3], tickets[4]};
        Ticket[] actual = agency.findTicketsByDepartureLocation("Dortmund");
        assertArrayEquals(expected, actual);
    }

    @Test
    void findTicketsByDepartureDateTest() {
        Ticket[] expected = {tickets[0], tickets[1], tickets[4], tickets[5]};
        Ticket[] actual = agency.findTicketsByDepartureDate("16-12-2024");
        assertArrayEquals(expected, actual);
    }
}