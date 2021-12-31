package day4;

public class Accounts {
    private String acNo;
    private double balance;

    public String getAcNo() {
        return acNo;
    }

    public void setAcNo(String acNo) {
        this.acNo = acNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void transfer(double amount, double bal1, double bal2){
        System.out.println("Money transfer in progress....");
        bal1 = bal1 - amount;
        bal2 = bal2 + amount;
        System.out.println("New balance of Account 1: " + bal1);
        System.out.println("New balance of Account 2: " + bal2);

    }
}
