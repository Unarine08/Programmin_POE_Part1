/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registrationandlogin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Unarine Makumule
 */
public class RegistrationAndLoginTest {
    
    public RegistrationAndLoginTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
  

    /**
     * Test of isValidUsername method, of class RegistrationAndLogin.
     */
    @org.junit.jupiter.api.Test
    public void testIsValidUsername() {
        System.out.println("Username successfully captured");
        String username = "kyl_1";
        RegistrationAndLogin instance = new RegistrationAndLogin();
        boolean expResult = false;
        boolean result = instance.isValidUsername(username);
       
    }
    /**
     * Test of is inValidUsername method, of class RegistrationAndLogin.
     */
     @org.junit.jupiter.api.Test
     public void testIsinValidUsername() {
        System.out.println("Username is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 characters in length .");
        String username = "kyle!!!!!!!";
        RegistrationAndLogin instance = new RegistrationAndLogin();
        boolean expResult = true;
        boolean result = instance.isValidUsername(username);
       
    }
    /**
     * Test of isValidPassword method, of class RegistrationAndLogin.
     */
    @org.junit.jupiter.api.Test
    public void testIsValidPassword() {
        System.out.println("Password successfully captured");
        String password = "Ch&&sec@ke99!";
        RegistrationAndLogin instance = new RegistrationAndLogin();
        boolean expResult = false;
        boolean result = instance.isValidPassword(password);
    
    }
  /**
     * Test of inValidPassword method, of class RegistrationAndLogin.
     */
    @org.junit.jupiter.api.Test
    public void testInValidPassword() {
        System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character." );
        String password = "password";
        RegistrationAndLogin instance = new RegistrationAndLogin();
        boolean expResult = true;
        boolean result = instance.isValidPassword(password);
    
    }
    /**
     * Test of createAccount method, of class RegistrationAndLogin.
     */
    @org.junit.jupiter.api.Test
    public void testCreateAccount() {
        System.out.println("Please create account");  
        String username = "kyl_1";
        String password = "Ch&&sec@ke99!";
        String firstName = "Unarine";
        String lastName = "Makumule";
        RegistrationAndLogin instance = new RegistrationAndLogin();
        instance.createAccount(username, password, firstName, lastName);
      
    }

    /**
     * Test of login method, of class RegistrationAndLogin.
     */
    @org.junit.jupiter.api.Test
    public void testLogin() {
        System.out.println("Please login");
        String username = "kyl_1";
        String password = "Ch&&sec@ke99!";
        RegistrationAndLogin instance = new RegistrationAndLogin();
        boolean expResult = false;
        boolean result = instance.login(username, password);
      
    }
    
    /**
     * Test of failed login method, of class RegistrationAndLogin.
     */
    @org.junit.jupiter.api.Test
    public void testFailedLogin() {
        System.out.println("Username or password incorrect, please try again login");
        String username = "unar";
        String password = "UnariM";
        RegistrationAndLogin instance = new RegistrationAndLogin();
        boolean expResult = true;
        boolean result = instance.login(username, password);
      
    }

    /**
     * Test of main method, of class RegistrationAndLogin.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RegistrationAndLogin.main(args);
       
    }
    
}
