package com.bleedingtooth.vitupedia.classes.user;

import com.bleedingtooth.vitupedia.util.Utils;

/**
 * Represents a user; the base class of various other user types.
 */
public abstract class User {
    private String username;
    private String password;
    private long balance = 0;

    /**
     * Create a new user with a username and password. Balance is set to 0.
     * 
     * @param username The username.
     * @param password The password.
     */
    public User(String username, String password) {
        Utils.requireStringNonEmpty(username, "username");
        Utils.requireStringNonEmpty(password, "password");

        this.username = username;
        this.password = password;
    }

    /**
     * Create a new user with a username, password and balance.
     * 
     * @param username The username.
     * @param password The password.
     * @param balance  The balance.
     */
    public User(String username, String password, long balance) {
        Utils.requireStringNonEmpty(username, "username");
        Utils.requireStringNonEmpty(password, "password");

        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        Utils.requireStringNonEmpty(username, "username");

        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        Utils.requireStringNonEmpty(password, "password");

        this.password = password;
    }
}
