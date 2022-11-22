package com.ku.bank;

import java.util.Objects;
import java.util.StringJoiner;

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
        return new StringJoiner (", ", Account.class.getSimpleName() + " [", "]")
                .add("id=" + id)
                .add("entityId=" + entityId)
                .add("balance=" + balance)
                .add("bankId=" + bankId)
                .add("isCompany=" + isCompany)
                .toString();
    }

    @Override
    public boolean equals(Object obj) {       // переопределение equals
        if (obj == this) {
            return true;
    }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Account aThat = (Account) obj;
        return id.equals(aThat.id) &&
                entityId.equals(aThat.entityId) &&
                balance.equals(aThat.balance)  &&
                bankId.equals(aThat.bankId) &&
                isCompany.equals(aThat.isCompany);
    }

    @Override
    public int hashCode() {                            // переопределение hashCode
        int result = 17;

        result = 37 * result + (int) (id - (id >>> 32));
        result = 37 * result + (int) (entityId - (entityId >>> 32));
        result = 37 * result + (int) (balance - (balance >>> 32));
        result = 37 * result + (int) (bankId - (bankId >>> 32));
        result = 37 * result + (isCompany ? 1 : 0 );
                return result;
            }
}
