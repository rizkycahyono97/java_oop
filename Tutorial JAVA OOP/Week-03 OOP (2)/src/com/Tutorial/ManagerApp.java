package com.Tutorial;

class ManagerApp {
    public static void main(String[] args){
        try {
            var manager = new Manager();
            manager.name = "Rizky";
            manager.sayHello("User1");
    
            var vp = new VicePresident();
            vp.name = "Jokowi";
            vp.sayHello("User1");
        } catch (Exception e){
            e.printStackTrace();
        }
    } 
}
