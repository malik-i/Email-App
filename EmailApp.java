/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Email Application
Scenario: You are an IT Support Admin Specialist and are charged with the tas
    of creating email accounts for new hires.

Objectives:
    - Generate an email address
        - firstname.lastname@department.company.com
    - Determine teh department, if none leave blank
    - Generate a random String for password
    - Have set methods to change the password, set the mailbox capacity,
        and define an alternate email address
    - Have get methods to display the name, email, and mailbox capacity
*/
package emailapp;

/**
 *
 * @author malik
 */
public class EmailApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Email em1 = new Email("John", "Smith");
        
        System.out.println(em1.showInfo());
    }
    
}
