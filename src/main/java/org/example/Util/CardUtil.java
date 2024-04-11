package org.example.Util;

import jdk.swing.interop.SwingInterOpUtils;
import org.example.AdminPanel;
import org.example.Model.Card;
import org.example.Model.Customer;
import org.example.Model.Db;

import java.util.Scanner;



public class CardUtil {
    public static void checkCustomerCard(){
        if(Db.customerIndex>1){
            DbUtil.addCard(createdCustomerCard());
        }
        else{
            System.out.println("Sistemde musteri yoxdur. ");
            System.out.println("Musteri elave edin. ");
        }
    }
    public static Card createdCustomerCard(){
        Customer[] customers = Db.getCustomers();
        Scanner scanner = new Scanner(System.in);
        CustomerUtil.printAllCustomer();
        System.out.print("Secdiyiniz musterinin id daxil edin: ");  int customerId = scanner.nextInt();
        if (customers[customerId] !=null && customers[customerId].getActive()==true) {
            System.out.println("**Karti yaradin!**");
            System.out.print("Kart nomresi: ");
            Long number = scanner.nextLong();
            System.out.print("Kartin bitme tarixi: ");
            String expDate = scanner.next();
            System.out.print("Kartin cvv kodu: ");
            int cvv = scanner.nextInt();
            return new Card((long) Db.cardIndex, false, customers[customerId], number, expDate, cvv);
        }
        else{
            System.out.println("Sistemde bele bir musteri yoxdur.");
            System.out.println("Yeniden secim edin.");
            return createdCustomerCard();
        }

    }
    public static void printCustomerCard(){
        Card [] cards = Db.getCards();
        for(Card card: cards){
            if(card!=null && card.getStatus()==false){
                System.out.println(card);
            }
        }
    }
    public static void blockedCard(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Movcud kartlar ve statuslari: ");
        Card [] cards = Db.getCards();
        for(Card card: cards){
            if(card!=null){
                if(card.getStatus()==false){
                    System.out.println("ID=" + card.getId() + " -" +card.getCustomer().getName()+ " " +card.getCustomer().getSurname()+ " " + card.getNumber() +" "+ "Blokda deyil.");
                }
                else{
                    System.out.println("ID=" + card.getId() + " -" +card.getCustomer().getName()+ " " +card.getCustomer().getSurname()+ " " + card.getNumber() +" "+ "Kart blokdadir.");
                }
            }
        }
        System.out.print("Kartin idsin daxil edin: ");
        int idCard= scanner.nextInt();
        Card [] card = Db.getCards();
       try {
           System.out.println(AdminPanel.blockSwitchMenu);
           System.out.print("Secim edin: ");
           int option = scanner.nextInt();
           if(option==1 || option ==2){
               operateOptionCardBlocked(option,idCard);
           }
           else {
               System.out.println("Sehf secim yeniden secim edin.");
               blockedCard();
           }
       } catch (NullPointerException e){
           System.out.println("Problem var: " + e.getMessage());
       }

    }
    public static void operateOptionCardBlocked(int option,int idCard){
        Card [] cards = Db.getCards();
        switch(option){
            case 1 :
                if(cards[idCard].getStatus()==false){
                    cards[idCard].setStatus(true);
                    System.out.println("Kart bloka salindi. ");
                }
                else{
                    System.out.println("Kart onsuz blokdadir. ");
                }
                break;
            case 2:
                if(cards[idCard].getStatus()==true){
                    cards[idCard].setStatus(false);
                    System.out.println("Kart blokdan cixarildi ");
                }
                else{
                    System.out.println("Kart onsuz blokda deyil. ");
                }
                break;
        }
    }



}
