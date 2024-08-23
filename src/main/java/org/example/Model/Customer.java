package org.example.Model;

import java.io.Serializable;

public class Customer implements Serializable {

    private static final long serialVersionUID = 1234567L;
    private Long id;
    private Boolean isActive;
    private String name;
    private String surname;
    private String fin;
    private String phoneNumber;

    public Customer() {

    }

    public Customer(Long id, Boolean isActive, String name, String surname, String fin, String phoneNumber) {
        this.id = id;
        this.isActive = isActive;
        this.name = name;
        this.surname = surname;
        this.fin = fin;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate='" + fin + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
