package CLI;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomerTask implements Runnable {
    private final TicketPool ticketPool;
    private final int quantity;
    private final String customerName;
    private final ConcurrentHashMap<String, AtomicInteger> purchaseSummary;

    public CustomerTask(TicketPool ticketPool, int quantity, String customerName, ConcurrentHashMap<String, AtomicInteger> purchaseSummary) {
        this.ticketPool = ticketPool;
        this.quantity = quantity;
        this.customerName = customerName;
        this.purchaseSummary = purchaseSummary;
    }

    @Override
    public void run() {
        int ticketsBought = 0;
        for (int i = 0; i < quantity; i++) {
            Ticket ticket = ticketPool.buyTicket();
            if (ticket != null) {
                System.out.println("Customer " + customerName + " bought ticket: " + ticket);
                ticketsBought++;
            } else {
                System.out.println("No tickets left for " + customerName + " to buy.");
                break;
            }
        }
        // Record how many tickets the customer bought
        purchaseSummary.put(customerName, new AtomicInteger(ticketsBought));
    }
}
