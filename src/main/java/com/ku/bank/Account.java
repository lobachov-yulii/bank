package com.ku.bank;

public class Account {
    private long id;
    private long entityId;
    private long balance;
    private long bankId;
    private int isCompany;

    public Account (long id, long entityId, long balance, long bankId, int isCompany) {
        this.id = id;
        this.entityId = entityId;
        this.balance = balance;
        this.bankId = bankId;
        this.isCompany = isCompany;
    }

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }
    public long getEntityId() {
        return entityId;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    public long getBalance() {
        return balance;
    }

    public void setBankId(long bankId) {
        this.bankId = bankId;
    }
    public long getBankId() {
        return bankId;
    }

    public void setIsCompany(int isCompany) {
        this.isCompany = isCompany;
    }
    public int getIsCompany() {
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
        return account.id == id &&
                account.entityId == entityId &&
                account.balance == balance &&
                account.bankId == bankId &&
                account.isCompany == isCompany;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = (int) (31 * result + id);
                return result;
    }
}
