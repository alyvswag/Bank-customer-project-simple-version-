package org.example;

import org.example.Model.Db;
import org.example.Util.CardUtil;
import org.example.Util.CustomerUtil;
import org.example.Util.DbUtil;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("***");
            System.out.println(AdminPanel.mainPanel);
            System.out.print("Emeliyyati daxil edin: ");
            int option = scanner.nextInt();
            if(option==1){
                System.out.println(AdminPanel.printAdminPanelCustomer);
                System.out.print("Emeliyyati daxil edin: ");
                int optionC = scanner.nextInt();
                operateOptionCustomer(optionC);
            } else if (option==2) {
                System.out.println(AdminPanel.printAdminPanelCard);
                System.out.print("Emeliyyati daxil edin: ");
                int optionC = scanner.nextInt();
                operateOptionCard(optionC);
            }
            else {
                System.out.println("Sehf secim yeniden secim edin.");
            }
        }
    }
    public static void operateOptionCustomer(int option){
        switch (option){
            case 1:
                DbUtil.addCustomer(CustomerUtil.createCustomer());
                FileUtil.writeCustomerFile(Db.customers);
                break;
            case 2:
//                CustomerUtil.printAllCustomer();
                FileUtil.readCustomerFile();
                break;
            case 3:
                CustomerUtil.deleteCustomer();
                break;
            default:
                System.out.println("Qardas sehf secim etdiniz. Yeniden secim edin");
        }
    }
    public static void operateOptionCard(int option){
        switch (option){
            case 1:
                CardUtil.checkCustomerCard();
                break;
            case 2:
                CardUtil.printCustomerCard();
                break;
            case 3:
                CardUtil.blockedCard();
                break;
            default:
                System.out.println("Qardas sehf secim etdiniz. Yeniden secim edin");

        }
    }

}