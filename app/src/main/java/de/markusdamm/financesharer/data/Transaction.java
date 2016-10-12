package de.markusdamm.financesharer.data;

import java.util.HashSet;
import java.util.Set;

public class Transaction {
    private int money;
    private Set<User> users = new HashSet<>();
    private User payer;

    public boolean addUser(User user) {
        if (users.contains(user)) {
            return true;
        } else {
            users.add(user);
            return false;
        }
    }

    public User getPayer() {
        return payer;
    }

    public Set<User> getUsers() {
        return users;
    }

    public int getMoney() {
        return money;
    }
}