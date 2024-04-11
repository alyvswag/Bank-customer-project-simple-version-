package org.example.Util;

import org.example.Model.Customer;
import org.example.Model.Db;

import java.util.Scanner;

public class CustomerUtil {
    public static Customer createCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adi: ");
        String name = scanner.next();
        System.out.print("Soyadi: ");
        String surname = scanner.next();
        System.out.print("Fin daxil edin: ");
        String fin = scanner.next();
        System.out.print("Telefon nomresi: ");
        String phoneNumber = scanner.next();
        return new Customer((long) Db.customerIndex,true,   name, surname, fin, phoneNumber);
    }

    public static void printAllCustomer() {
        System.out.println("Mövcüd müştərilər: ");
        Customer[] customers = Db.getCustomers();
        for (Customer customer : customers) {
            if (customer != null && customer.getActive()!=false){
                System.out.println(customer);
            }
        }
    }
    public static void deleteCustomer(){
        Scanner scanner = new Scanner(System.in);
        printAllCustomer();
        System.out.print("Silmek istediyiniz musterinin id-sin daxil edin(geri donmek ucun 0 daxil edin): ");
        int idCustomer = scanner.nextInt();
        if(idCustomer==0){
            return;
        }
        try{Customer[] customers = Db.getCustomers();
            customers[idCustomer].setActive(false);
            System.out.println("Musteri ugurla silindi.");
        }
        catch (NullPointerException e){
            System.out.println("Problem var: " + e.getMessage());
        }

    }



}
