package CLI;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private Long id;
    private String name;
    private List<Ticket> ticketsBought = new ArrayList<>();

    public Customer() {
    }

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer(int id, int ticketsWanted, TicketPool ticketPool) {
        this.id = (long) id;
        this.name = "Customer-" + id;
        purchaseTickets(ticketsWanted, ticketPool);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ticket> getTicketsBought() {
        return ticketsBought;
    }

    public void addTicket(Ticket ticket) {
        ticketsBought.add(ticket);
    }

    public void purchaseTickets(int ticketsWanted, TicketPool ticketPool) {
        for (int i = 0; i < ticketsWanted; i++) {
            Ticket ticket = ticketPool.getTicket();
            if (ticket != null) {
                ticketsBought.add(ticket);
            } else {
                System.out.println("No more tickets available!");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ticketsBought=" + ticketsBought +
                '}';
    }
}
