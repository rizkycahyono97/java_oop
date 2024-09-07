package package1.app;

import package1.data.LoginRequest;
import package1.error.ValidationException;
import package1.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("", "password");
        ValidationUtil.ValidateRuntime(loginRequest);

        // try {
        //     ValidationUtil.ValidateRuntime(loginRequest);
        //     System.out.println("data valid");
        // } catch (ValidationException | NullPointerException e) {
        //     System.out.println("Terjadi Error dengan Pesan " + e.getMessage());
        // } finally {
        //     System.out.println("Sukses");
        // }
    }
}
