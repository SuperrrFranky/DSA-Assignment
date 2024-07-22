/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.assignment;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class VolunteerUI {
    private VolunteerManager volunteerManager;
    private Scanner scanner;

    public VolunteerUI(VolunteerManager volunteerManager) {
        this.volunteerManager = volunteerManager;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int choice;
        do {
            System.out.println("\nVolunteer Management System");
            System.out.println("1. Add new volunteer");
            System.out.println("2. Remove a volunteer");
            System.out.println("3. Search for a volunteer");
            System.out.println("4. Assign volunteer to an event");
            System.out.println("5. List all volunteers");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addVolunteer();
                    break;
                case 2:
                    removeVolunteer();
                    break;
                case 3:
                    searchVolunteer();
                    break;
                case 4:
                    assignVolunteerToEvent();
                    break;
                case 5:
                    listAllVolunteers();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    private void addVolunteer() {
        System.out.print("Enter volunteer ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter volunteer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter volunteer contact info: ");
        String contactInfo = scanner.nextLine();

        Volunteer volunteer = new Volunteer(id, name, contactInfo);
        volunteerManager.addVolunteer(volunteer);
        System.out.println("Volunteer added successfully.");
    }

    private void removeVolunteer() {
        System.out.print("Enter volunteer ID to remove: ");
        String id = scanner.nextLine();
        Volunteer volunteer = volunteerManager.searchVolunteerById(id);
        if (volunteer != null) {
            volunteerManager.removeVolunteer(volunteer);
            System.out.println("Volunteer removed successfully.");
        } else {
            System.out.println("Volunteer not found.");
        }
    }

    private void searchVolunteer() {
        System.out.print("Enter volunteer ID to search: ");
        String id = scanner.nextLine();
        Volunteer volunteer = volunteerManager.searchVolunteerById(id);
        if (volunteer != null) {
            System.out.println(volunteer);
        } else {
            System.out.println("Volunteer not found.");
        }
    }

    private void assignVolunteerToEvent() {
        System.out.print("Enter volunteer ID: ");
        String volunteerId = scanner.nextLine();
        System.out.print("Enter event ID: ");
        String eventId = scanner.nextLine();
        System.out.print("Enter event name: ");
        String eventName = scanner.nextLine();
        System.out.print("Enter event date: ");
        String eventDate = scanner.nextLine();

        Event event = new Event(eventId, eventName, eventDate);
        volunteerManager.assignVolunteerToEvent(volunteerId, event);
        System.out.println("Volunteer assigned to event successfully.");
    }

    private void listAllVolunteers() {
        DoublyLinkedList<Volunteer> volunteers = volunteerManager.listAllVolunteers();
        for (Volunteer volunteer : volunteers) {
            System.out.println(volunteer);
        }
    }
}
