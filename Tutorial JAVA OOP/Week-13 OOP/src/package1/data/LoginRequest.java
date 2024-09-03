package package1.data;

public record LoginRequest (String username, String password) {
    public LoginRequest{
        System.out.println("Contrustor utama dipanggil");
    }

    public LoginRequest(String username) {
        this(username, null);
    }

    public LoginRequest() {
        this(null);
    }
}
