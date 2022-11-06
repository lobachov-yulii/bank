package com.ku.bank;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank(12, 256, "Belarusbank");
            System.out.println(bank);
        Bank bank1 = new Bank(12, 256, "Belarusbank");
        System.out.println(bank);
        Account account = new Account(14, 18, 2000, 16, 118);
            System.out.println(account);
        Account account1 = new Account(12, 18, 2000, 16, 118);
            System.out.println(account);
        System.out.println(account.equals(account1));
        System.out.println(bank.equals(bank1));

    }
}
