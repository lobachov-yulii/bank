package com.ku.bank;

public class Bank {
    private long id;
    private long companyId;
    private String bankName;

    public Bank(long id, long companyId, String bankName) {
        this.id = id;
        this.companyId = companyId;
        this.bankName = bankName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }


    public String toString() {      // переопределение метода toString
        return "Bank [id=" + id
                + ", companyId=" + companyId
                + ", bankName=" + bankName + "]";
    }

    @Override
    public boolean equals(Object obj) {       // переопределение equals
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Bank bank = (Bank) obj;
        return bank.id == id &&
                bank.companyId == companyId &&
                bank.bankName.equals(bankName);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = (int) (31 * result + id);
        return result;
}
}

