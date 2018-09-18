package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {
    private String name;
    private long balance;
    private String animalType;
    private boolean isKing;
    private boolean godOrBadGuy;

    public BankAccount(String name, long balance, String animalType, boolean isKing, boolean godOrBadGuy) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = false;
        this.godOrBadGuy = false;
    }

    public BankAccount() {

    }

    public boolean isGodOrBadGuy() {
        return godOrBadGuy;
    }

    public void setGodOrBadGuy(boolean godOrBadGuy) {
        this.godOrBadGuy = godOrBadGuy;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
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
