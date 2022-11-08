package bytebank.conta;

public class Account {
    private double balance;
    private int agency;
    private int acc_number;
    private Client acc_owner;
    private static int total = 0;

    public Account(int agency, int acc_number) {
        Account.total++;
        System.out.println("Total Accounts: " + total);
        this.agency = agency;
        this.acc_number = acc_number;
        //this.balance = 100;
        System.out.println("Account Number: " + this.acc_number);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getAcc_number() {
        return acc_number;
    }

    public void setAcc_number(int acc_number) {
        this.acc_number = acc_number;
    }

    public Client getAcc_owner() {
        return acc_owner;
    }

    public void setAcc_owner(Client acc_owner) {
        this.acc_owner = acc_owner;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Account.total = total;
    }

    public void deposit (double amount) {
        this.setBalance(this.getBalance() + amount);
    }

    public boolean withdraw (double amount) {
        if (this.getBalance() >= amount) {
            this.setBalance(this.getBalance() - amount);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean transfer (Account receiver, double amount){
        if (this.getBalance() >= amount){
            this.setBalance(this.getBalance() - amount);
            receiver.deposit(amount);
            return true;
        } else {
            return false;
        }

    }
}

