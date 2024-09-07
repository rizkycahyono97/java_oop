package package1.util;

import package1.data.LoginRequest;
import package1.error.BlankException;
import package1.error.ValidationException;

public class ValidationUtil {
    public static void ValidateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is Blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is Null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is Blank");
        }
    }
}


