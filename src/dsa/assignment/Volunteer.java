/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.assignment;

import dsa.assignment.Event;

/**
 *
 * @author User
 */
public class Volunteer {
    private String id;
    private String name;
    private String contactInfo;
    private DoublyLinkedList<Event> events; // Events assigned to the volunteer

    public Volunteer(String id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.events = new DoublyLinkedList<>();
    }

    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getContactInfo() { return contactInfo; }
    public DoublyLinkedList<Event> getEvents() { return events; }

    public void setName(String name) { this.name = name; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }

    // Methods to add and remove events
    public void addEvent(Event event) { events.add(event); }
    public void removeEvent(Event event) { events.remove(event); }

    @Override
    public String toString() {
        return "Volunteer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }
}
