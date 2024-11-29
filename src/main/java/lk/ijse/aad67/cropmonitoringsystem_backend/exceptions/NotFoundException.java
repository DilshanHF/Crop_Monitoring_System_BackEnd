package lk.ijse.aad67.cropmonitoringsystem_backend.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {

    }
    public NotFoundException(String message) {
        super(message);
    }
    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
