package main.java;

public class Request {
    private int customerId;
    private String accountType;
    private double amount;

    public Request(int customerId, String accountType, double amount) {
        this.customerId = customerId;
        this.accountType = accountType;
        this.amount = amount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Request{" +
                "customerId=" + customerId +
                ", accountType='" + accountType + '\'' +
                ", amount=" + amount +
                '}';
    }
}
