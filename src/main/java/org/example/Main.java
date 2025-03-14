package org.example;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Nathan Kiprotich","20348636", 5000,"xyz@gmail.com", "0728");
        Customer customer2 = new Customer("Nathoo","203436", 500,"qwe@yahoo.com","45678");
        Customer customer3 = new Customer("Kiprotich","2034836", 500000,"rfd@gmail.com","0987");
        Customer customer4 = new Customer("Nathan Kiprotich","0348636", 00,"ty@y.com","123456");



        customer1.depositMoney(5400);
        customer4.depositMoney(-100);
        customer2.withdrawMoney(400);
        customer3.withdrawMoney(4567);
        customer1.setBalance(56789.66);
        customer1.withdrawMoney(123);
        customer1.setName("Nay");
        customer1.getName();
        customer1.toString();
        customer1.setBalance(100);
        System.out.println(customer1);


    }

}