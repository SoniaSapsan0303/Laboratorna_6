package com.program.menu.commands;
import com.program.mobilecompany.CreateMobileCompany;
public class AmountOfUsers implements MenuExecute{
    @Override
    public void execute() {
        System.out.println("The amount of users is "+ CreateMobileCompany.company.getAmountOfClients()+".");
    }
}
