/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.assignment;

/**
 *
 * @author User
 */
public class DSAAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VolunteerManager volunteerManager = new VolunteerManager();
        VolunteerUI volunteerUI = new VolunteerUI(volunteerManager);
        volunteerUI.displayMenu();
    }    
}
