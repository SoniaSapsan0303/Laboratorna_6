package com.program.tariffmenu;
import com.program.Tariff.Roaming;
import com.program.mobilecompany.CreateMobileCompany;
import java.util.Scanner;
public class AddTariffToRoaming implements MenuTariff{
    public static Scanner scanner = new Scanner(System.in);
    @Override
    public void doTariffMenu(){
        System.out.println("Please, enter the name of tariff which you would like to subscribe to roaming");
        int index = CreateMobileCompany.company.gettingTheIndex();
        if(index == -1){
            System.out.println("We don't have that tariff, you will be returned to main menu!");
            return;
        }
        if(CreateMobileCompany.company.getListOfTariffs().get(index).getClass() == Roaming.class){
            System.out.println("That tariff already is subscribed to roaming, you will be returned to main menu");
            return;
        }
        System.out.println("Please, enter the countries for your roaming");
        String countries = scanner.nextLine();
        Roaming roaming = new Roaming(CreateMobileCompany.company.getListOfTariffs().get(index).getName(),
                CreateMobileCompany.company.getListOfTariffs().get(index).getPrice(),
                CreateMobileCompany.company.getListOfTariffs().get(index).getGigabytes(),
                CreateMobileCompany.company.getListOfTariffs().get(index).getCallsInMinutes(),
                CreateMobileCompany.company.getListOfTariffs().get(index).getAmountOfMessages(),
                countries);
        CreateMobileCompany.company.getListOfTariffs().add(roaming);
    }
}