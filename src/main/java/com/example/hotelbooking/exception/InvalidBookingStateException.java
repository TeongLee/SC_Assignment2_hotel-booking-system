package com.example.hotelbooking.exception;

/**
 * Thrown when a booking status transition is not legal for the booking's current
 * state — e.g. checking out a booking that was never checked in, or cancelling a
 * booking that has already been checked out. Mapped to HTTP 409 by
 * GlobalExceptionHandler.
 */
public class InvalidBookingStateException extends RuntimeException {

    public InvalidBookingStateException(String message) {
        super(message);
    }
}
