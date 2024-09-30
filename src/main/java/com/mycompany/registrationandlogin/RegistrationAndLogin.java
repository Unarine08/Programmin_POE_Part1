/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationandlogin;

/**
 *
* @author Unarine Makumule
 */
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegistrationAndLogin {

    private String username;
    private String password;
    private String firstName;
    private String lastName;

    // Method to check if the username is valid
    public boolean isValidUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }
      public String getFirstName() {
      return this.firstName;
   }

   public void setFirstName(String firstname) {
      this.firstName = this.lastName;
   }

   public String getLastName() {
      return this.lastName;
   }

   public void setLastName(String lastname) {
      this.password = this.lastName;
   }

   public String getUsername() {
      return this.username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPassword() {
      return this.password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public boolean isValidUsername() {
      return this.username != null && this.username.contains("_") && this.username.length() <= 5;
      
   }

    // Method to check if the password is valid
    public boolean isValidPassword(String password) {
        if (password.length() < 8) return false;
        // Must contain an uppercase letter
        if (!Pattern.compile("[A-Z]").matcher(password).find()) return false; 
        // Must contain a number
        if (!Pattern.compile("[0-9]").matcher(password).find()) return false; 
        // Must contain a special character
        if (!Pattern.compile("[^a-zA-Z0-9]").matcher(password).find()) return false; 
        return true;
    }

    // Method to create a new user account
    public void createAccount(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("\nAccount created successfully!");
    }

    // Method to login user and verify the credentials
    public boolean login(String username, String password) {
        if (this.username == null || this.password == null) {
            System.out.println("No user found, please create an account first.");
            return false;
        }

        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Login successful! Welcome " + this.firstName + " " + this.lastName);
            return true;
        } else {
            System.out.println("Login failed! Invalid username or password.");
            return false;
        }
    }
    
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistrationAndLogin loginSystem = new RegistrationAndLogin();
        
        // While loop to keep asking for valid account creation details
        boolean isAccountCreated = false;

        System.out.println("Please create an account:");

        while (!isAccountCreated) {
            System.out.print("Please enter username:");
            String username = scanner.nextLine();
            
            System.out.print("Please enter password: ");
            String password = scanner.nextLine();

            System.out.print("Please enter  first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Please enter last name: ");
            String lastName = scanner.nextLine();

            if (!loginSystem.isValidUsername(username)) {
                System.out.println("Invalid username!Username is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 characters in length .");
            } else if (!loginSystem.isValidPassword(password)) {
                System.out.println("Invalid password!Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character." );
            } else {
                loginSystem.createAccount(username, password, firstName, lastName);
                isAccountCreated = true;
            }
        }

        // Proceed to login if account creation is successful
        System.out.println("\nLogin:");
        System.out.print("Enter username: ");
        String loginUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String loginPassword = scanner.nextLine();

        // Attempt login
        loginSystem.login(loginUsername, loginPassword);

        scanner.close();
    }
}

