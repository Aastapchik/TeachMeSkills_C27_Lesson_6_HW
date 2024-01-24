package com.lesson7.homework.task1.runner;

import com.lesson7.homework.task1.service.CreditCard;

public class Runner {

    public static void main(String[] args) {

        CreditCard cl1 = new CreditCard(1234, 158.15);
        CreditCard cl2 = new CreditCard(7832, 1858.17);
        CreditCard cl3 = new CreditCard(7317, 274.57);

        cl1.addAmount(14.74);
        cl2.addAmount(74.51);
        cl3.withdrawAmount(74.57);
        cl1.showStatus();
        cl2.showStatus();
        cl3.showStatus();
    }
}
