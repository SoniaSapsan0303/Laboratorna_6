package com.program.specialdisplayingoftariffs;
import com.program.mobilecompany.CreateMobileCompany;
public class SortTariffByPrice implements DisplaySpecialTariffs {
    @Override
    public void displayTariffsSpecially() {
     CreateMobileCompany.company.sortTariffsByPrice();
        System.out.println("The sort is done");
    }
}