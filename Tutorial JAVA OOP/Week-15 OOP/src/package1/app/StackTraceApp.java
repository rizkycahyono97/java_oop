package package1.app;

public class StackTraceApp {
    public static void main(String[] args) {
        try{
            String[] names = {
                "A", "B", "C"
            };
        } catch (Throwable throwable) {
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();

            throwable.printStackTrace();
        }
    }
}
