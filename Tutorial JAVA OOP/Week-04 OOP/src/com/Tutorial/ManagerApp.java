package com.Tutorial;

class ManagerApp {
    public static void main(String[] args){
        try {
            var manager = new Manager("Agus", "Google");
            manager.sayHello("User1");
            System.out.println(manager.getSalary());
    
            var vp = new VicePresident("Rizky");
            vp.sayHello("User1");
            System.out.println(vp.getSalary());
            System.out.println(vp.getParentSalary());
        } catch (Exception e){
            e.printStackTrace();
        }
    } 
}
