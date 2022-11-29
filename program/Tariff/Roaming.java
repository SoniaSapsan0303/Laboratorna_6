package com.program.Tariff;
public class Roaming extends Tariff{
    private String countries;

    public Roaming(){}
    public Roaming(String name, double price, int gigabytes, int callsInMinutes, int amountOfMessages, String countries){
        super(name, price, gigabytes, callsInMinutes, amountOfMessages);
        this.countries = countries;
        this.price = this.getPrice() + (this.getPrice()*0.1);
        this.name = this.getName() + " Roaming";
    }

    public String getCountries() {
        return countries;
    }
    public void setCountries(String countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
         return "Your tariff is "+name+". It costs "+price+"$. It includes "+ gigabytes
                + " gigabytes, "+ callsInMinutes+" minutes for your calls and "+ amountOfMessages+ " amount of messages.\n It works in "+countries+" countries.";
    }

    public void changeTariff(){
        System.out.println("Please, enter what you wanted yo edit: 1 - Name, 2 - Price, 3 - Gigabytes, 4 Calls in minutes, 5 - Amount of messages, 6 - Countries ");
        int choice;
        while(true){
            choice  = Integer.parseInt(scanner.nextLine());
            if(choice >= 1 && choice <= 6)
                break;
            else
                System.out.println("You have entered the wrong data, please try again!");
        }
        System.out.println("Please, enter the new value");
        String value = scanner.nextLine();
        switch (choice){
            case 1 -> this.name = value;
            case 2 -> this.price = Double.parseDouble(value);
            case 3 -> this.gigabytes = Integer.parseInt(value);
            case 4 -> this.callsInMinutes =  Integer.parseInt(value);
            case 5 -> this.amountOfMessages = Integer.parseInt(value);
            case 6 -> this.countries = value;
        }
    }
}
