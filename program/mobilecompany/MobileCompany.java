package com.program.mobilecompany;
import com.program.Tariff.Tariff;
import com.program.mainmenu.MainMenu;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
    public class MobileCompany {
        public static Scanner scanner = new Scanner(System.in);
    protected String name;
    protected int amountOfClients;
    protected ArrayList<Tariff> listOfTariffs = new  ArrayList<Tariff>();



    public void startProgram(){
        Scanner scanner = new Scanner(System.in);
        MainMenu menu = new MainMenu();
        boolean incorrectEnter = false;
        int command;
        System.out.println("Welcome to Sapsan Mobile Company! :");
        while(true) {
            do {
                showMenu();
                try {
                    command = Integer.parseInt(scanner.nextLine());
                    if (command >= 0 && command <= 5) {
                        menu.execute(command);
                    } else {
                        throw new Exception();
                    }
                } catch (Exception error) {
                    System.out.println("try again... 0 - 5");
                    incorrectEnter = true;
                }
            } while (incorrectEnter);
        }
    }
    private void showMenu(){
        System.out.print("""
                \n\t[1] - show tariffs
                \t[2] - show amount of users our company
                \t[3] - add new tariff
                \t[4] - display tariffs specially
                \t[5] - open tariff menu
                \t[0] - exit
                Enter command :\t""");
    }
    public void sortTariffsByPrice(){
        Comparator<Tariff> comparator = Comparator.comparing(obj -> obj.getPrice());
        listOfTariffs.sort(comparator);
    }
    public void FilteringTariff(int choice) {
        System.out.println("Please, enter the min and the max for your filtering:");
        System.out.println("Min: ");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Max: ");
        int max = Integer.parseInt(scanner.nextLine());
        for (Tariff tariff: CreateMobileCompany.company.getListOfTariffs()) {
            switch(choice){
                case 1:
                    if(tariff.getGigabytes() >= min && tariff.getGigabytes() <= max)
                        System.out.println(tariff.toString());
                    break;
                case 2:
                    if(tariff.getCallsInMinutes() >= min && tariff.getCallsInMinutes() <= max)
                        System.out.println(tariff.toString());
                    break;
            }
        }
    }
    public int gettingTheIndex(){
        for (Tariff tariff: this.getListOfTariffs()) {
            System.out.println("|\t"+tariff.getName()+"\t|");
        }
        String name = "";
        boolean exit = false;
        int index = 0;
        while(!exit){
            name = scanner.nextLine();
            for (int i = 0; i < this.listOfTariffs.size(); i++) {
                if(this.listOfTariffs.get(i).getName().equalsIgnoreCase(name)){
                    exit = true;
                    break;
                }
                index++;
            }
            if(!exit)
                return -1;
        }
        return index;
    }
    public int getAmountOfClients() {
        return amountOfClients;
    }
    public  ArrayList<Tariff> getListOfTariffs() {
        return listOfTariffs;
    }
    public void setListOfTariffs(ArrayList<Tariff> listOfTariffs) {
        this.listOfTariffs = listOfTariffs;
    }
    public void setAmountOfClients(int amountOfClients) {
        this.amountOfClients = amountOfClients;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
