package com.homecare.core.exceptions.custom;

public class UnauthorizedException extends Exception {
    public UnauthorizedException() {
        super("Action unauthorized.");
    }
}
