package day4;

import java.util.Scanner;

public class BankEncapsulation {
    public static void main(String[] args) {
        Accounts ac1 = new Accounts();
        ac1.setAcNo("1526352");
        ac1.setBalance(5000.46);
        Accounts ac2 = new Accounts();
        ac2.setAcNo("1123526352");
        ac2.setBalance(25000.546);
        double bal1 = ac1.getBalance();
        double bal2 = ac2.getBalance();
        System.out.println("How much do you want to transfer?");
        Scanner scan = new Scanner(System.in);
        double amount = scan.nextDouble();
        ac1.transfer(amount, bal1,bal2);
        System.out.println("Transfer of " + amount + " completed.....");
    }

}
