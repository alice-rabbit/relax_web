package com.ecnu.relax.exception;


public class InvalidTokenException extends AuthenticationFailureException {

    public InvalidTokenException(String token) {
        super("invalid token:" + token);
    }
}
