package org.example.Util;

import org.example.Model.Card;
import org.example.Model.Customer;
import org.example.Model.Db;

import static org.example.Model.Db.cardIndex;
import static org.example.Model.Db.customerIndex;


public class DbUtil {
    public static void addCustomer(Customer customer){
        Customer [] customers = Db.getCustomers();
        customers[customerIndex++] = customer;
        System.out.println("Musteri ugurla elave edildi.");
    }

    public static void addCard(Card card){
        Card [] cards = Db.getCards();
        cards[cardIndex++] = card;
        System.out.println("Musteri ucun yeni kart yaradildi.");
    }
}
