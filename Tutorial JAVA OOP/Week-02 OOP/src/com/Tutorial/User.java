package com.Tutorial;

public class User {
    String username;
    String password;
    String phoneNumber;
    String email;
    Boolean admin = true;
    final String country = "Indonesia";

    // Method
    void userMe() throws Exception {
        System.out.println("My Username is  " + this.username+ 
            " Password " + this.password+ 
            (this.admin? " is_admin ": "")+
            " country "+ this.country 
        );
    }

    void login(String username, String password){
        if (this.username == username && this.password == password) {
            System.out.println("Success Login with Username " + username);
        } else {
            System.out.println("Error Login with Username " + username);
        }
    }

    // contructor
    User(String paramUsername, String paramPassword, String paramPhoneNumber, Boolean paramAdmin){
        username = paramUsername;
        password = paramPassword;
        phoneNumber = paramPhoneNumber;
        admin = paramAdmin;
    }
} 



