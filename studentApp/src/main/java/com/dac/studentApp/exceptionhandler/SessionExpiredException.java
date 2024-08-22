package com.dac.studentApp.exceptionhandler;



/**
 * Custom exception class to handle session expiration scenarios.
 */
public class SessionExpiredException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Default constructor
    public SessionExpiredException() {
        super("Session has expired. Please log in again.");
    }

    // Constructor with custom message
    public SessionExpiredException(String message) {
        super(message);
    }
}

