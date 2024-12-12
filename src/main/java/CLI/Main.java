package CLI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the TicketPool
        System.out.print("Enter the maximum capacity of the Ticket Pool: ");
        int maxCapacity = scanner.nextInt();
        TicketPool ticketPool = new TicketPool(maxCapacity);

        // Input vendor details
        System.out.print("Enter the number of vendors: ");
        int numVendors = scanner.nextInt();

        List<Thread> vendorThreads = new ArrayList<>();
        for (int i = 0; i < numVendors; i++) {
            System.out.print("Enter the number of tickets Vendor ID-" + i + " will add: ");
            int totalTickets = scanner.nextInt();
            System.out.print("Enter the ticket release rate (in milliseconds) for Vendor ID-" + i + ": ");
            int ticketReleaseRate = scanner.nextInt();

            Vendor vendor = new Vendor(totalTickets, ticketPool, ticketReleaseRate);
            Thread vendorThread = new Thread(vendor, "Vendor-" + i);
            vendorThreads.add(vendorThread);
        }

        // Start vendor threads
        for (Thread vendorThread : vendorThreads) {
            vendorThread.start();
        }

        // Allow vendors some time to add tickets before customers start purchasing
        try {
            Thread.sleep(2000); // Adjust this delay as needed
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Input customer details
        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();

        List<Thread> customerThreads = new ArrayList<>();
        for (int i = 0; i < numCustomers; i++) {
            System.out.print("Enter the number of tickets Customer ID-" + i + " wants to buy: ");
            int ticketsWanted = scanner.nextInt();

            Customer customer = new Customer(i, ticketsWanted, ticketPool);
            Thread customerThread = new Thread(() -> customer.purchaseTickets(ticketsWanted, ticketPool), "Customer-" + i);
            customerThreads.add(customerThread);
        }

        // Start customer threads
        for (Thread customerThread : customerThreads) {
            customerThread.start();
        }

        // Wait for all vendor threads to finish
        for (Thread vendorThread : vendorThreads) {
            try {
                vendorThread.join();
            } catch (InterruptedException e) {
                System.err.println("Vendor thread interrupted.");
                Thread.currentThread().interrupt();
            }
        }

        // Wait for all customer threads to finish
        for (Thread customerThread : customerThreads) {
            try {
                customerThread.join();
            } catch (InterruptedException e) {
                System.err.println("Customer thread interrupted.");
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Purchase Summary:");
    }
}
