# Ticketing System

## Description

The Ticketing System is a comprehensive application that facilitates ticket management and purchase operations. It comprises a CLI-based backend with multithreaded functionality and an Angular-based frontend for user interaction. The project simulates a real-world ticketing system with concurrent operations and a user-friendly interface.

## Features

### Backend (CLI)

Vendors can add tickets to a shared pool.

Customers can purchase tickets concurrently.

Synchronized operations using Java concurrency mechanisms.

### Frontend (Angular)

User selection between vendor and customer roles.

Vendor dashboard to manage tickets.

Customer interface for ticket purchase.

Configuration panel for system administrators.

### General Features

Real-time ticket availability updates.

Flexible pool capacity management.

Cross-platform compatibility.

### Technologies Used

Backend: Java, Multithreading

Frontend: Angular, TypeScript, HTML/CSS

Database: H2 Database (for data persistence)

### System Architecture

#### CLI (Backend)

Handles ticket pool operations and manages vendor/customer tasks.

Provides a multithreaded environment for concurrency.

#### Frontend

Offers a user-friendly interface for vendors and customers.

Provides real-time updates and system configurations.

### Setup Instructions

Prerequisites

Java JDK 11 or higher

Node.js and npm

Angular CLI

### Backend Setup (CLI)

#### Clone the repository:

git clone https://github.com/Raveensa/TicketingSystem
cd ticketing-system/backend

Compile and run the backend:

javac -d bin src/*.java
java -cp bin CLI.Main

### Frontend Setup (Angular)

Navigate to the Angular project directory:

cd ticketing-system/frontend

### Install dependencies:

npm install

Start the Angular development server:

ng serve

Access the application at http://localhost:4200.

Usage

### CLI

Follow the prompts to initialize the ticket pool.

Vendors can add tickets by specifying quantity and release rate.

Customers can purchase tickets by specifying the desired quantity.

### Angular Frontend

Navigate to the user selection screen.

Log in as a vendor or customer.

Vendors can manage tickets in the dashboard.

Customers can browse and purchase available tickets.

### Future Improvements

Implement authentication for vendors and customers.

Enhance real-time updates using WebSockets.

Add reporting and analytics features.

## Contributing

We welcome contributions! Please create an issue or submit a pull request if you have suggestions or improvements.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
