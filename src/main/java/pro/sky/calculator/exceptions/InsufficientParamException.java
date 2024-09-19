package pro.sky.calculator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InsufficientParamException extends RuntimeException {
    private static final String MESSAGE = "Не подан один или оба параметров";

    public InsufficientParamException() {
        super(MESSAGE);
    }
}
