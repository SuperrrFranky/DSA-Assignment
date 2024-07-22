/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.assignment;

/**
 *
 * @author User
 */
public class VolunteerManager {
    private DoublyLinkedList<Volunteer> volunteers;

    public VolunteerManager() {
        this.volunteers = new DoublyLinkedList<>();
    }

    // Add a new volunteer
    public void addVolunteer(Volunteer volunteer) {
        volunteers.add(volunteer);
    }

    // Remove a volunteer
    public void removeVolunteer(Volunteer volunteer) {
        volunteers.remove(volunteer);
    }

    // Search for a volunteer by ID
    public Volunteer searchVolunteerById(String id) {
        for (Volunteer v : volunteers) {
            if (v.getId().equals(id)) {
                return v;
            }
        }
        return null;
    }

    // Assign a volunteer to an event
    public void assignVolunteerToEvent(String volunteerId, Event event) {
        Volunteer volunteer = searchVolunteerById(volunteerId);
        if (volunteer != null) {
            volunteer.addEvent(event);
        }
    }

    // List all volunteers
    public DoublyLinkedList<Volunteer> listAllVolunteers() {
        return volunteers;
    }
}
