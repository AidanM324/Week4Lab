package ie.atu.week4lab;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlers {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String showErrors()
    {
        return "errors";
    }
}
