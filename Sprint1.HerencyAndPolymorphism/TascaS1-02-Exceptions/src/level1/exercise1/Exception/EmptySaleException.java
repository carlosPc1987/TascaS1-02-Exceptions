package level1.exercise1.Exception;

public class EmptySaleException extends Exception {
    public EmptySaleException() {
        super("You must add products before making a sale");
    }
}

