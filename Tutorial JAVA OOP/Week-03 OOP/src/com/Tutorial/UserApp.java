package com.Tutorial;

public class UserApp {
    public static void main(String[] args){
        // (W-3)
        var user10 = new User("Rizky", "123456", "0858437761913", true);
        user10.userMe();
        user10.login("Rizky", "123456", "085843761913", true);
    }
}

