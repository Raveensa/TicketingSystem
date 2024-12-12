package CLI;

public class Vendor implements Runnable {
    private final int ticketsToAdd;
    private final TicketPool ticketPool;
    private final int releaseRate;

    // Main Constructor
    public Vendor(int ticketsToAdd, TicketPool ticketPool, int releaseRate) {
        this.ticketsToAdd = ticketsToAdd;
        this.ticketPool = ticketPool;
        this.releaseRate = releaseRate;
    }

    @Override
    public void run() {
        int remaining = ticketsToAdd;
        while (remaining > 0) {
            if (ticketPool.addTicket(new Ticket())) {
                remaining--;
            }
            try {
                Thread.sleep(releaseRate); // Pause for release rate duration
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Vendor thread interrupted.");
                break;
            }
        }
        System.out.println("Vendor finished adding tickets.");
    }
}
