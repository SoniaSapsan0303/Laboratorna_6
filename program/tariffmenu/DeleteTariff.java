package com.program.tariffmenu;
import com.program.mobilecompany.CreateMobileCompany;
public class DeleteTariff implements MenuTariff{
    @Override
    public void doTariffMenu(){
        System.out.println("Please, enter the name of tariff which you would like to delete");
        int index = CreateMobileCompany.company.gettingTheIndex();
        if(index == -1){
            System.out.println("We don't have that tariff, you will be returned to main menu!");
            return;
        }
        CreateMobileCompany.company.getListOfTariffs().remove(index);
    }
}