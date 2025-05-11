package com.bleedingtooth.vitupedia.classes.user;

/**
 * Represents a user; the base class of various other user types.
 */
public abstract class User {
    private String username;

    public User(String username) {
        super();

        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
