package com.netcracker.ch3;

public class CashRegister {
    private double salesTotal;
    private double salesCount;

    private double purchase;
    private double payment;
    private double tax;
    private double totalTax;
    private int itemCount;
    private String receipt;

    public CashRegister(double tax) {
        this.tax = tax;
        receipt = "";
    }

    public void recordPurchase(double amount) {
        purchase += amount;
        itemCount++;
        receipt += "Товар стоил: " + amount + "\n";
    }

    public void recordTaxablePurchase(double amount) {
        purchase += amount * (1 + tax / 100);
        itemCount++;
        receipt += "Товар стоил: " + amount * (1 + tax / 100) + " + налог " + amount * (tax / 100) + "\n";
    }

    public double getTotalTax(){
        return totalTax;
    }

    public void receivePayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        salesTotal += purchase;
        salesCount += itemCount;
        printReceipt();

        purchase = 0;
        payment = 0;
        totalTax = 0;
        itemCount = 0;
        receipt = "";
        return change;
    }

    public void printReceipt(){
        System.out.println(receipt);
    }

    public double getSalesTotal() {
        return salesTotal;
    }

    public double getSalesCount() {
        return salesCount;
    }

    public void reset(){
        salesTotal = 0;
        salesCount = 0;
    }
}
