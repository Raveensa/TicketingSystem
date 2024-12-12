package CLI;

import java.util.LinkedList;
import java.util.List;

public class TicketPool {
    private final int capacity; // Maximum capacity of the ticket pool
    private final List<Ticket> pool; // List to store tickets

    public TicketPool(int capacity) {
        this.capacity = capacity;
        this.pool = new LinkedList<>();
    }

    // Method to add a ticket to the pool
    public synchronized boolean addTicket(Ticket ticket) {
        while (pool.size() >= capacity) {
            System.out.println("Pool is full. Vendor waiting for space...");
            try {
                wait(); // Wait until space is available in the pool
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Vendor thread interrupted while waiting.");
                return false;
            }
        }
        pool.add(ticket);
        System.out.println("Ticket added. Current pool size: " + pool.size());
        notifyAll(); // Notify waiting customers that tickets are available
        return true;
    }

    // Method for customers to get a ticket from the pool
    public synchronized Ticket getTicket() {
        while (pool.isEmpty()) {
            System.out.println("No tickets available! Customer waiting for vendors...");
            try {
                wait(); // Wait until tickets are added to the pool
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Customer thread interrupted while waiting.");
                return null;
            }
        }
        Ticket ticket = pool.remove(0);
        System.out.println("Ticket removed. Current pool size: " + pool.size());
        notifyAll(); // Notify vendors that space is available
        return ticket;
    }

    // Method to get the current size of the pool
    public synchronized int getPoolSize() {
        return pool.size();
    }

    public Ticket buyTicket() {
        return null;
    }
}
