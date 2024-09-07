package package1.error;

public class ValidationException extends Throwable {
    private String messege;

    public ValidationException(String messege) {
        super(messege);
        this.messege = messege;
    }

    public String getMessege() {
        return this.messege;
    }
}