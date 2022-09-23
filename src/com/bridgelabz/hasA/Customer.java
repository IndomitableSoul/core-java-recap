package com.bridgelabz.hasA;

import java.util.ArrayList;
import java.util.List;

public class Customer {
     List<Account> accounts = new ArrayList<>();

    public static void main(String[] args) {
        Customer customer = new Customer();
        Account account1 = new Account(123, "Nikita", "SBI1000");
        customer.accounts.add(account1);
    }
}
