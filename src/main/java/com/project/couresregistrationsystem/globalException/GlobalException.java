package com.project.couresregistrationsystem.globalException;

import com.project.couresregistrationsystem.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalException {

 @ExceptionHandler(CourseNotFound.class)
    public ResponseEntity<ErrorMessage> CourseNotFound(CourseNotFound courseNotFound){
     ErrorMessage errorMessage  = new ErrorMessage(LocalDateTime.now(),courseNotFound.getMessage(),
             "Invalid Process ,Please TryAgain");
     return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
 }
}
