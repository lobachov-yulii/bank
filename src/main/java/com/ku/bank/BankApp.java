package com.ku.bank;

public class BankApp {
    public static void main(String[] args) {
        Account account = new Account(22, 18, 2000, 16, true);
            System.out.println(account);
        Account account1 = new Account(12, 18, 2001, 16, true);
            System.out.println(account1);
            System.out.println(account.equals(account1));


    }
}
