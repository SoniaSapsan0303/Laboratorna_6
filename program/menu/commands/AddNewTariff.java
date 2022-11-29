package com.program.menu.commands;
import com.program.Tariff.Tariff;
import com.program.mobilecompany.CreateMobileCompany;
import java.util.Scanner;
public class AddNewTariff implements MenuExecute{
    public static Scanner scanner = new Scanner(System.in);
    public void execute() {
        Tariff tariff = new Tariff();
        boolean incorrectEnter = false;
        do {
            try {
                System.out.println("Please, enter a name of tariff: ");
                String name = scanner.nextLine();
                if (!name.equals("")||name!=null) {
                    tariff.setName(name);
                } else {
                    throw new Exception();
                }
                System.out.println("Please, enter a price of tariff: ");
                double price = Double.parseDouble(scanner.nextLine());
                if(price>0){
                    tariff.setPrice(price);
                }else{
                    throw new Exception();
                }
                System.out.println("Please, enter an amount of minutes for calls of tariff: ");
                int minutes = Integer.parseInt(scanner.nextLine());
                if(minutes>0){
                    tariff.setCallsInMinutes(minutes);
                }else{
                    throw new Exception();
                }
                System.out.println("Please, enter an amount of gigabytes of tariff: ");
                int gigabytes = Integer.parseInt(scanner.nextLine());
                if(minutes>0){
                    tariff.setGigabytes(gigabytes);
                }else{
                    throw new Exception();
                }
                System.out.println("Please, enter an amount of messages of tariff: ");
                int messages = Integer.parseInt(scanner.nextLine());
                if(messages>0){
                    tariff.setAmountOfMessages(messages);
                }else{
                    throw new Exception();
                }
            } catch (Exception error) {
                System.out.println("Please, try again!");
                incorrectEnter = true;
            }
        }while(incorrectEnter);
        CreateMobileCompany.company.getListOfTariffs().add(tariff);
    }
}
