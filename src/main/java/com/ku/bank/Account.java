package com.ku.bank;

import java.util.Objects;

public class Account {
    private Long id;
    private Long entityId;
    private Long balance;
    private Long bankId;
    private Boolean isCompany;

    public Account (long id, long entityId, long balance, long bankId, boolean isCompany) {
        this.id = id;
        this.entityId = entityId;
        this.balance = balance;
        this.bankId = bankId;
        this.isCompany = isCompany;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public Long getBankId() {
        return bankId;
    }

    public void setIsCompany(Boolean isCompany) {
        this.isCompany = isCompany;
    }

    public Boolean getIsCompany() {
        return isCompany;
    }


    @Override
    public String toString () {        // переопределение метода toString
        return "Account [id=" + id
                + ", entityId=" + entityId
                + ", balance=" + balance
                + ", bankId=" + bankId
                + ", isCompany=" + isCompany + "]";
    }

    @Override
    public boolean equals(Object obj) {       // переопределение equals
        if (obj == this) {
            return true;
    }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Account account = (Account) obj;
        return account.id.equals(id) &&
                account.entityId.equals(entityId) &&
                account.balance.equals(balance)  &&
                account.bankId.equals(bankId) &&
                account.isCompany.equals(isCompany);
    }

    @Override
    public int hashCode() {                            // переопределение hashCode
        return Objects.hash(id, entityId, balance, bankId, isCompany);
            }
}
