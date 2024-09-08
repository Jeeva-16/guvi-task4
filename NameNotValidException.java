public class NameNotValidException extends Exception {
    public NameNotValidException() {
        super("Name contains invalid characters.");
    }
}
