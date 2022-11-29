package com.program.Tariff;
import java.util.Scanner;
public class Tariff {
    public static Scanner scanner = new Scanner(System.in);
    protected String name;
    protected double price;
    protected int gigabytes;
    protected int callsInMinutes;
    protected int amountOfMessages;
    public Tariff(){

    }
    public Tariff(String name, double price, int gigabytes, int callsInMinutes, int amountOfMessages){
        this.name = name;
        this.price = price;
        this.gigabytes = gigabytes;
        this.callsInMinutes = callsInMinutes;
        this.amountOfMessages = amountOfMessages;
    }

    public int getAmountOfMessages() {
        return amountOfMessages;
    }

    public void setAmountOfMessages(int amountOfMessages) {
        this.amountOfMessages = amountOfMessages;
    }

    public int getCallsInMinutes() {
        return callsInMinutes;
    }

    public void setCallsInMinutes(int callsInMinutes) {
        this.callsInMinutes = callsInMinutes;
    }

    public int getGigabytes() {
        return gigabytes;
    }

    public void setGigabytes(int gigabytes) {
        this.gigabytes = gigabytes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "Your tariff is "+name+". It costs "+price+"$. It includes "+ gigabytes
                + " gigabytes, "+ callsInMinutes+" minutes for your calls and "+ amountOfMessages+ " amount of messages.\n";
    }
    public void changeTariff(){
        System.out.println("Please, enter what you wanted yo edit: 1 - Name, 2 - Price, 3 - Gigabytes, 4 Calls in minutes, 5 - Amount of messages ");
        int choice;
        while(true){
            choice  = Integer.parseInt(scanner.nextLine());
            if(choice >= 1 && choice <= 5)
                break;
            else
                System.out.println("You have entered the wrong data, please try again!");
        }
        System.out.println("Please, enter the new value:");
        String value = scanner.nextLine();
        switch (choice){
            case 1 -> this.name = value;
            case 2 -> this.price = Double.parseDouble(value);
            case 3 -> this.gigabytes = Integer.parseInt(value);
            case 4 -> this.callsInMinutes =  Integer.parseInt(value);
            case 5 -> this.amountOfMessages = Integer.parseInt(value);
        }
    }
}
