package com.program.specialdisplayingoftariffs;
import com.program.mobilecompany.CreateMobileCompany;
public class FilteringTariffByMinutes implements DisplaySpecialTariffs {
    @Override
    public void displayTariffsSpecially() {
        System.out.println("Filtering by minutes");
        CreateMobileCompany.company.FilteringTariff(2);
    }
}