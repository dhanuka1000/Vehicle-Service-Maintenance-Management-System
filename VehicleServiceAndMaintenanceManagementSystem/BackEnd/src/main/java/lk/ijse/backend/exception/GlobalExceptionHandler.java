package lk.ijse.backend.exception;

import lk.ijse.backend.util.APIResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<APIResponse<String>> handleCustomException(CustomException ex){
        return new ResponseEntity<>(new APIResponse<>(400, ex.getMessage(), null), HttpStatus.BAD_REQUEST);
    }
}
