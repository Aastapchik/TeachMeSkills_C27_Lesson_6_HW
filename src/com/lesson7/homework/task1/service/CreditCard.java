package com.lesson7.homework.task1.service;

public class CreditCard {

    int clientCheck;
    double currentAmount;

    public CreditCard(int clientCheck, double currentAmount) {
        this.clientCheck= clientCheck;
        this.currentAmount = currentAmount;
    }

    public void addAmount(double sum)
    {
        this.currentAmount += sum;
    }

    public void withdrawAmount(double sum)
    {
        this.currentAmount -= sum;
    }

    public void showStatus()
    {
        System.out.println("Сумма на счету клиента " + this.clientCheck + " равна " + this.currentAmount);
    }
}
