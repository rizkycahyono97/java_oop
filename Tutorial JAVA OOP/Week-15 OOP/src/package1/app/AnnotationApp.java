package package1.app;

import package1.annotation.Fancy;

@Fancy(name = "AnnotationApp", tags = {"Application", "java"})
public class AnnotationApp {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
