package package1.app;

import package1.data.CreateUserRequest;
import package1.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername(null);
        request.setPassword(null);
        request.setAddress(null);
        ValidationUtil.ValidationReflection(request);
    }
}
