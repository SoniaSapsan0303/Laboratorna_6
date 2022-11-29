package com.program.menu.commands;
import com.program.Tariff.Tariff;
import com.program.mobilecompany.CreateMobileCompany;
public class ShowAllTariff implements MenuExecute{
    @Override
    public void execute() {
        System.out.println("Look at these beautiful tariffs!");
        for (Tariff tariff: CreateMobileCompany.company.getListOfTariffs()) {
            System.out.println(tariff.toString());
        }
    }
}
