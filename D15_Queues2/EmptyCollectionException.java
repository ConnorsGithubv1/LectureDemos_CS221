
public class EmptyCollectionException extends RuntimeException{
    public EmptyCollectionException() {
        super("The collection is empty.");
    }

    public EmptyCollectionException(String message) {
        super(message);
    }
}
