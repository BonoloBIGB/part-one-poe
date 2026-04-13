/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

/**
 *
 * @author Bonolo ST10527039
 */
import java.util.Scanner;
public class LoginClass {//Start of the class
    private String username;
private String password;
private String cellPhoneNumber;
private String firstName;
private String lastName;


public LoginClass(String username, String password, String cellPhoneNumber, String firstName, String lastName) {
    this.username = username;
    this.password = password;
    this.cellPhoneNumber = cellPhoneNumber;
    this.firstName = firstName;
    this.lastName = lastName;
}

// Getters
public String getUsername() { return username; }
public String getPassword() { return password; }
public String getCellPhoneNumber() { return cellPhoneNumber; }
public String getFirstName() { return firstName; }
public String getLastName() { return lastName; }

/**
 * Checks that username contains an underscore and is no more than 5 characters long.
 */
public boolean checkUserName() {
    return username != null && username.contains("_") && username.length() <= 5;
}

/**
 * Checks password complexity:
 * - At least 8 characters
 * - Contains a capital letter
 * - Contains a number
 * - Contains a special character
 */
public boolean checkPasswordComplexity() {
    if (password == null || password.length() < 8) return false;
    boolean hasUpper = false, hasDigit = false, hasSpecial = false;
    for (char c : password.toCharArray()) {
        if (Character.isUpperCase(c)) hasUpper = true;
        else if (Character.isDigit(c)) hasDigit = true;
        else if (Character.isLetterOrDigit(c)) hasSpecial = true;
    }
    return hasUpper && hasDigit && hasSpecial;
}

/**
 * Checks cell phone number using regex:
 * Must start with international country code (+XX or +XXX) followed by up to 10 digits total.
 * Reference: https://eur03.safelinks.protection.outlook.com/?url=https%3A%2F%2Fwww.oreilly.com%2Flibrary%2Fview%2Fregular-expressions-cookbook%2F9781449327453%2Fch04s03.html&data=05%7C02%7Cst10527039%40rcconnect.edu.za%7C68c3a8188e074af2a5ac08de98031099%7Ce10c8f44f469448fbc0dd781288ff01b%7C0%7C0%7C639115336150073214%7CUnknown%7CTWFpbGZsb3d8eyJFbXB0eU1hcGkiOnRydWUsIlYiOiIwLjAuMDAwMCIsIlAiOiJXaW4zMiIsIkFOIjoiTWFpbCIsIldUIjoyfQ%3D%3D%7C0%7C%7C%7C&sdata=u0gRheyM4PzAH57hlMi7MunoDcgmlGKXvz8eT6VFlnU%3D&reserved=0
 */
public boolean checkCellPhoneNumber() {
    if (cellPhoneNumber == null) return false;
    // International format: + followed by country code and number, total digits <= 10 after +
    return cellPhoneNumber.matches("^\\+27\\d{9}$") ;
}

/**
 * Registers user and returns appropriate message.
 */
public String registerUser() {
    if (!checkUserName()) {
        return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
    }
    if (!checkPasswordComplexity()) {
        return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
    }
    if (!checkCellPhoneNumber()) {
        return "Cell phone number incorrectly formatted or does not contain international code.";
    }
    return "Registration successful";
}

/**
 * Verifies login credentials.
 */
public boolean loginUser(String enteredUsername, String enteredPassword) {
    return this.username.equals(enteredUsername) && this.password.equals(enteredPassword);
}

/**
 * Returns login status message.
 */
public String returnLoginStatus(String enteredUsername, String enteredPassword) {
    if (loginUser(enteredUsername, enteredPassword)) {
        return "Welcome " + firstName + " " + lastName + " it is great to see you again.";
    }
    return "Username or password incorrect, please try again.";
}

}

    
  