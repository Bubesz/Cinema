package iit.cinema.exception;

/**
 * Created by Attila on 2015.09.27..
 */
public class CinemaException extends Exception {

    private String errorMessage;
    private int errorCode;

    public CinemaException(String message, int code) {
        errorMessage = message;
        errorCode = code;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}