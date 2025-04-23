package Items;

public class ElementAlreadyExistsException extends IllegalArgumentException {
    
    public ElementAlreadyExistsException() {
        super("Element already exists in the collection.");
    }
    
    public ElementAlreadyExistsException(String message) {
        super(message);
    }
    
}
