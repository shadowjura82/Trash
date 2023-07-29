package com.webmarket.trash.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TrashExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public void itemNotFoundException(RuntimeException e) {
        System.out.println("Упс, что-то пошло не так");
        System.out.println(e.getMessage());
    }

    @ExceptionHandler(NullPointerException.class)
    public void NullPointerException(NullPointerException e) {
        System.out.println("Упс, что-то пошло не так");
        System.out.println(e.getMessage());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public void illegalException(NullPointerException e) {
        System.out.println("Упс, что-то пошло не так");
        System.out.println(e.getMessage());
    }
}
