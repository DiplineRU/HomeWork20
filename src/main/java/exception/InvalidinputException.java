package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidinputException extends RuntimeException{
    public InvalidinputException() {
    }

    public InvalidinputException(String message) {
        super(message);
    }

    public InvalidinputException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidinputException(Throwable cause) {
        super(cause);
    }

    public InvalidinputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
