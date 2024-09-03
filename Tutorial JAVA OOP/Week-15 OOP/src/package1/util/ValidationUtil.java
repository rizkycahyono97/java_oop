package package1.util;

import java.lang.reflect.Field;
import package1.annotation.NotBlank;
import package1.error.BlankException;  // Pastikan ini diimpor

public class ValidationUtil {
    public static void ValidationReflection(Object object) {
        Class<?> aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);
            if (field.getAnnotation(NotBlank.class) != null) {
                // Validate
                try {
                    String value = (String) field.get(object);
                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }
}
