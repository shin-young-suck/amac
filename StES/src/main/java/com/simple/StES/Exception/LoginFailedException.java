package com.simple.StES.Exception;

public class LoginFailedException extends RuntimeException{

	public LoginFailedException(String message) {
        super(message);
    }
}
