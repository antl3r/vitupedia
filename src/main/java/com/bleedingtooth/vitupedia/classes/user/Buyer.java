package com.bleedingtooth.vitupedia.classes.user;

public class Buyer extends User {
    public Buyer(String username, String password) {
        super(username, password);
    }

    public Buyer(String username, String password, long balance) {
        super(username, password, balance);
    }
}
