package com.program.specialdisplayingoftariffs;
import com.program.mobilecompany.CreateMobileCompany;
public class FilteringTariffsByGigabytes implements DisplaySpecialTariffs {
    @Override
    public void displayTariffsSpecially() {
        System.out.println("Filtering by gigabytes:");
        CreateMobileCompany.company.FilteringTariff(1);
    }
}