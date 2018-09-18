package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {
    private String name;
    private long balance;
    private String animalType;

    public BankAccount(long id,String name, long balance, String animalType) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public BankAccount() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
