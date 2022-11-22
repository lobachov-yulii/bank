package com.ku.bank;

public class BankApp {
    public static void main(String[] args) {
        Account account = new Account(22, 18, 2000,16, true);
            System.out.println(account);
        Account account1 = new Account(22, 18, 2000, 16, true);
            System.out.println(account1);
        Account account2 = new Account(22, 18, 2000, 16, false);
            System.out.println(account2);
            System.out.println(account.equals(account1));
            System.out.println(account.equals(account2));

    }
}
