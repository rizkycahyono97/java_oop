package package1.app;

import package1.data.LoginRequest;


public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Fulan", "password");
        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Nuh"));
        System.out.println(new LoginRequest("Nuh", "Bahtera"));
    }
}
