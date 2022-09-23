package com.bridgelabz.hasA;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private String ifsc;
    private String branch;

    private String accountType;

    public Account(int accountNumber, String accountHolderName, String ifsc) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.ifsc = ifsc;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
