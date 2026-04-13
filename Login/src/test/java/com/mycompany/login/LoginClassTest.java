/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.login;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginClassTest {
    
    public LoginClassTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        LoginClass instance = new LoginClass("kyl_1","","","","");
        boolean expResult = true;
        boolean result = instance.checkUserName();
        assertEquals(expResult, result);
        
    }

     @Test
    public void testCheckUserNameIncorrect() {
        System.out.println("checkUserName");
        LoginClass instance = new LoginClass("kyle!!!!!!!!!!!","","","","");
        boolean expResult = false;
        boolean result = instance.checkUserName();
        assertEquals(expResult, result);
        
    }

 
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
          LoginClass instance = new LoginClass("kyle!!!!!!!!!!!","Ch&&sec@ke99","","","");
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckPasswordComplexityIncorrect() {
        System.out.println("checkPasswordComplexity");
          LoginClass instance = new LoginClass("kyl_1","password","","","");
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkCellPhoneNumber method, of class LoginClass.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        LoginClass instance = new LoginClass("kyl_1","Ch&&sec@ke99","+27838968976","","");
        boolean expResult = true;
        boolean result = instance.checkCellPhoneNumber();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckCellPhoneNumberIncorrect() {
        System.out.println("checkCellPhoneNumber");
        LoginClass instance = new LoginClass("kyl_1","Ch&&sec@ke99","0896653","","");
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of registerUser method, of class LoginClass.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        LoginClass instance = new LoginClass("kyl_1","Ch&&sec@ke99","+27838968976","","");
        String expResult = "Registration successful";
        String result = instance.registerUser();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of loginUser method, of class LoginClass.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String enteredUsername = "kyl_1";
        String enteredPassword = "Ch&&sec@ke99";
        LoginClass instance = new LoginClass("kyl_1","Ch&&sec@ke99","+27838968976","","");
        boolean expResult = true;
        boolean result = instance.loginUser(enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testLoginUserIncorrect() {
        System.out.println("loginUser");
        String enteredUsername = "wrongUser";
        String enteredPassword = "wrongPass";
        LoginClass instance = new LoginClass("kyl_1","Ch&&sec@ke99","+27838968976","","");
        boolean expResult = false;
        boolean result = instance.loginUser(enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of returnLoginStatus method, of class LoginClass.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String enteredUsername = "kyl_1";
        String enteredPassword = "Ch&&sec@ke99";
        LoginClass instance = new LoginClass("kyl_1","Ch&&sec@ke99","+27838968976","","");
        String firstName = "";
        String lastName = "";
        String expResult = "Welcome " + firstName + " " + lastName + " it is great to see you again.";
        String result = instance.returnLoginStatus(enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        
    }
    
}
