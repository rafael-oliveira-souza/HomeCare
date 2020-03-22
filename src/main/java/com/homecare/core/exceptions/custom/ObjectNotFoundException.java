package com.homecare.core.exceptions.custom;

public class ObjectNotFoundException extends Exception {
    public ObjectNotFoundException() {
        super("Object not found");
    }
}
