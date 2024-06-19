package com.Tutorial;

public class UserApp {
    public static void main(String[] args) throws Exception {
        // Object
        // var user1 = new User();
        // User user2 = new User();
        // User user3;
        // user3 = new User();

        // // Percobaan print
        // // System.out.println(user1);
        // // System.out.println(user2);
        // // System.out.println(user3);

        // // Field
        // var user = new User();
        // user.username = "Rizky Cahyono Putra";
        // user.password = "test1234";
        // user.phoneNumber = "21334567";
        // user.email = "rizkycahyonoputra2004@gmail.com";

        // user1.username = "Muhammad Asep";
        // user2.username = "Bang Ojoy";
        // user3.username = "Anonymous";

        // // user.country = "Indonesia";
        // // System.out.println(user.username);
        // // System.out.println(user.password);
        // // System.out.println(user.phoneNumber);
        // // System.out.println(user.email);

        
        // // LATIHAN

        // // User4 dari Method User.java
        // // var user4 = new User();
        // // user4.userMe();
        // // user4.login("Asep", "123456");

        // // User5
        // var user5 = new User();
        // user5.username = "Fulan";
        // user5.password = "123456";
        // user5.userMe();
        // user5.login("Fulan", "123456");    

        var user6 = new User("Rizky Cahyono", "123456", "085843761913", true);
        user6.userMe();
    }
}

