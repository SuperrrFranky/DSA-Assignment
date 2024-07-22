/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.assignment;

/**
 *
 * @author User
 */
public class Event {
    private String id;
    private String name;
    private String date;

    public Event(String id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getDate() { return date; }

    public void setName(String name) { this.name = name; }
    public void setDate(String date) { this.date = date; }

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
