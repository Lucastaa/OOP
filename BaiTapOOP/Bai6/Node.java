package BaiTapOOP.Bai6;

public class Node {
    private long accountNumber;
    private double amount, fee;
    private String name;
    private double balance;
    private final double Rate = 0.035;
    public Node() {
        this.accountNumber = 999999;
        this.name = "chưa xác định";
        this.balance = 50000;
    }
    public boolean deposit() {
        if (amount > 0) {
            balance += amount ;
            return true;
        } else {
            return false;
        }
    }
    public boolean withdraw() {
        if (amount > 0 && amount + fee <= balance) {
            balance -= amount - fee;
            return true;
        } else {
            return false;
        }
    }
    public double addInterest() {
        return balance += balance*Rate;
    }
    public boolean transfer(Node acc2) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            acc2.balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public Node(long accountNumber, String name, double balance) {
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = 999999;
        }
        if (!name.trim().equals("")) {
            this.name = name;
        } else {
            this.name = "Chua xac dinh";
        }
        if (balance >= 50000) {
            this.balance = balance;
        } else {
            this.balance = 50000;
        }
    }

    public Node(long accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Node{" +
                "accountNumber=" + accountNumber +
                ", amount=" + amount +
                ", fee=" + fee +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", Rate=" + Rate +
                '}';
    }
}
