/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;

/**
 *
 * @author Bonolo ST10527039
 */
import java.util.Scanner;
public class Login {//Start of the class
 
    
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        
        //=====REGISTRATION=====
        System.out.println("Please register to continue.");
        System.out.println();
        
        System.out.println("Enter first name: ");
        String firstName=scanner.nextLine();
        
        System.out.println("Enter last name: ");
        String lastName=scanner.nextLine();
        
        System.out.println("Enter your username: ");
        String username=scanner.nextLine();
        
        System.out.println("Enter your password: ");
        String password=scanner.nextLine();
        
        System.out.println("Enter cell phone number (Start with +27 ):");
        String cellPhone=scanner.nextLine();
        
        LoginClass user = new LoginClass(username, password, cellPhone, firstName, lastName);
        System.out.println();
        System.out.println(user.registerUser());
        
        //Stop if registration failed
        if (!user.checkUserName()|| !user.checkPasswordComplexity()||!user.checkCellPhoneNumber() ){
            System.out.println("Registration unsuccessful. Please try again.");
            scanner.close();
            return;
        }
        //=====LOGIN=====
        System.out.println();
        System.out.println("Please Login");
        
        System.out.println("Enter username: ");
        String loginUsername=scanner.nextLine();
        
        System.out.println("Enter password: ");
        String loginPassword=scanner.nextLine();
        
        System.out.println();
        System.out.println(user.returnLoginStatus(loginUsername, loginPassword));
        
        scanner.close();
    }
    
}

       


