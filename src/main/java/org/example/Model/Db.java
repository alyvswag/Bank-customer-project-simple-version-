package org.example.Model;

public abstract class Db {
    private static final Customer [] customers = new Customer[10];
    private static final Card [] cards = new Card[20];
    public static Customer[] getCustomers() {
        return customers;
    }

    public static Card[] getCards() {
        return cards;
    }

    public static int customerIndex = 1;

    public static int cardIndex = 1;
}
