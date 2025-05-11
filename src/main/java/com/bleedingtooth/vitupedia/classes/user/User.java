package com.bleedingtooth.vitupedia.classes.user;

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
        setUsername(username);
        setPassword(password);
    }

    /**
     * Create a new user with a username, password and balance.
     * 
     * @param username The username.
     * @param password The password.
     * @param balance  The balance.
     */
    public User(String username, String password, long balance) {
        setUsername(username);
        setPassword(password);
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
        if (username.isEmpty())
            throw new IllegalArgumentException("Username cannot be empty.");

        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.isEmpty())
            throw new IllegalArgumentException("Password cannot be empty.");

        this.password = password;
    }
}
