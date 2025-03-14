package org.example;

public class Customer {
    private String name;
    private String accNumber;
    private double balance;
    private String eMail;
    private String phoneNumber;


    public void depositMoney(int depositMoney){
        if (depositMoney < 0){
            System.out.println("You cannot deposit a negative amount.");
        }
        else {
            this.balance += depositMoney;
            System.out.println("Deposit is successful,new balance is " + this.balance);
        }
    }
    public void withdrawMoney(int withdrawMoney){
        if (this.balance - withdrawMoney < 0){
            System.out.println("You do not have enough money in your account.Your balance is "+ this.balance);
        } else if (withdrawMoney < 0) {
            System.out.println("Withdrawal Failed!");
        } else  {
            this.balance -=withdrawMoney;
            System.out.println("Withdrawal successful current balance is "+ this.balance);
        }
    }

    public Customer(String name, String accNumber, double balance, String eMail,String phoneNumber) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
       this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "name " + name +
                "email " + eMail +
                "accNumber " + accNumber +
                "balance: " + balance;


    }
}


