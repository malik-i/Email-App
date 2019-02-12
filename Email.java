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

import java.util.Scanner;

/**
 *
 * @author malik
 */
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String email;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "kilamcreatives.com";
    
    // Constructor to recieve first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName; // setting the class variables to the local variables
        this.lastName = lastName;
        // RECALL: "this" keyword refers to the class level variable, and the 
            //"rvalues" refer to the local variable which is passed in the constructor
            
        // Call a method asking for the Dept.
        this.department = setDepartment(); // since ssetDepartment returns a String 
                                        // you can set it equal to a variable
        
        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("\nHi "+ this.firstName+ "! Your password is: " + this.password);
        
        // Combine elements to define email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() +"@" + department + "." + companySuffix;
    }
    // Ask for the department
    private String setDepartment(){
        System.out.print("New Worker: " + firstName + " " + lastName + "\nDEPARTMENT CODES\n1 for Sales\n2 for "
                + "Development\n3 for Accounting\n0 for none\nENTER DEPARTMENT CODE: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        
        if(departmentChoice == 1) { return "sales";}
        if(departmentChoice == 2) { return "dev";}
        if(departmentChoice == 3) { return "acct";}
        else { return "";} // this else takes care of the return type
    }
    
    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password = new char[length];
        // creating a char array which will be our password
        for(int i = 0; i < length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            // Math.random() gives you a random number between 0 and 1
            // so we cast it as an int and multiply that 
                // number by the length of the string
            password[i] = passwordSet.charAt(rand);
            // iterating through the array to add random values password position i
        }
        return new String(password);
        // returning  a new String, an "updated" String 
    
}
    
    // GETTERS AND SETTERS
    
    // Set the mailbox capacity 
    public void setMailboxCap(int cap){
        this.mailboxCapacity = cap; 
    }
    
    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    // Change the password
    public void changePassword(String password){
        this.password = password;
    }
    
    // these are public methods that access the properties
    public int getMailBoxCapacity() { return mailboxCapacity; } // getting each private data memeber
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword(){ return password; }
    
    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " +  email + 
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
    
    
}
