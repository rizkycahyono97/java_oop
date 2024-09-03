package package1.app;

import package1.data.HelloWorld;;

public class HelloWorldApp {
    public static void main(String[] args) {
        // English
        HelloWorld english = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        // Indonesia
        HelloWorld Indonesia = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };
        english.sayHello();
        english.sayHello("Fulan");
        Indonesia.sayHello();
        Indonesia.sayHello("Fulin");
    };
}
