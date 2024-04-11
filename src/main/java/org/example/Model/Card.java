package org.example.Model;

public class Card {
    private Long id;
    private Boolean status;
    private Customer customer;
    private Long number;
    private String expDate;
    private int cvv;

    public Card(){

    };
    public Card(Long id, Boolean status,Customer customer, Long number, String expDate, int cvv) {
        this.id = id;
        this.status = status;
        this.customer = customer;
        this.number = number;
        this.expDate = expDate;
        this.cvv = cvv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", customer=" + customer +
                ", number=" + number +
                ", expDate='" + expDate + '\'' +
                ", cvv=" + cvv +
                '}';
    }
}
