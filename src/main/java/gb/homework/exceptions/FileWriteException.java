package gb.homework.exceptions;

public class FileWriteException extends RuntimeException {
    public FileWriteException(String message, Throwable cause) {
        super(message, cause);
    }
}

