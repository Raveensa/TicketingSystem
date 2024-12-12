package CLI;

public class VendorConfig {
    private int vendorId;
    private int tickets;
    private int releaseRate;

    public VendorConfig(int vendorId, int tickets, int releaseRate) {
        this.vendorId = vendorId;
        this.tickets = tickets;
        this.releaseRate = releaseRate;
    }

    // Getters and Setters
    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public int getReleaseRate() {
        return releaseRate;
    }

    public void setReleaseRate(int releaseRate) {
        this.releaseRate = releaseRate;
    }
}
