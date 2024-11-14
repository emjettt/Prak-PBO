package com.atm.model;

import java.util.Scanner;

public class Account {
    private String accountNumber;
    private String pin;
    private double balance;
    public static final double MINIMUM_BALANCE = 50000.0; // Minimum balance of Rp50,000

    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // Getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    // Method untuk menambahkan saldo
    public void credit(double amount) {
        this.balance += amount;
    }

    // Method untuk mengurangi saldo
    public void debit(double amount) {
        this.balance -= amount;
    }

    // Method untuk mengubah PIN
    public boolean changePin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan PIN lama Anda: ");
        String oldPin = scanner.nextLine();

        if (!oldPin.equals(this.pin)) {
            System.out.println("PIN lama salah!");
            return false;
        }

        System.out.print("Masukkan PIN baru: ");
        String newPin = scanner.nextLine();

        System.out.print("Masukkan kembali PIN baru: ");
        String confirmPin = scanner.nextLine();

        if (!newPin.equals(confirmPin)) {
            System.out.println("PIN baru tidak cocok!");
            return false;
        }

        this.pin = newPin;
        System.out.println("PIN berhasil diperbarui.");
        return true;
    }
}