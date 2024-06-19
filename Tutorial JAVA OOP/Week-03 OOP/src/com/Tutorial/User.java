package com.Tutorial;

public class User {
    String username;
    String password;
    String phoneNumber;
    Boolean admin = true;

    // User(String username, String password){
    //     username = username;
    //     password = password;
    // }

    void userMe(){
        System.out.println("My username is : " + this.username +
        " Password: " + this.password +
        " PhoneNumber: " + this.phoneNumber + 
        (this.admin? " is admin ? ": ""));
    }

    void login(String username, String password, String phoneNUmber, Boolean admin){
        if((this.username.equals(username) && this.password.equals(password)) ||
        (this.phoneNumber.equals(phoneNumber) && this.admin.equals(admin))){
            System.out.println("Success login with username " + username);
        } else {
            System.out.println("Failed login with Username: " + username);
        }
    }

    // Constructor
    User(String username, String password, String phoneNumber, boolean admin){
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.admin = admin;
    }

    User(String username, String password, String phoneNumber){
        this(username, password, phoneNumber, false);
    }
    
    User(String username, String password){
        this(username, password, null);
    }

    User(String username){
        this(username, null);
    }
} 
