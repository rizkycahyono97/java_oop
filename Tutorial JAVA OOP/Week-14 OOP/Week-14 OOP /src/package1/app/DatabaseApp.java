package package1.app;

import package1.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("test", "rahasia");
        System.out.println("Success connect to db");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak dapat terhubung ke database: Username atau password null");
        }
        System.out.println("Koneksi ke database dengan username: " + username);
    }
}
