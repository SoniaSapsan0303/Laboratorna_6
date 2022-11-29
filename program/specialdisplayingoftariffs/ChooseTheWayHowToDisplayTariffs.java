package com.program.specialdisplayingoftariffs;
import com.program.mobilecompany.MobileCompany;
import java.util.ArrayList;
import java.util.List;
public class ChooseTheWayHowToDisplayTariffs extends MobileCompany {
    private final List<DisplaySpecialTariffs> menu = new ArrayList<>();
    public ChooseTheWayHowToDisplayTariffs(){
        menu.add(new SortTariffByPrice());
        menu.add(new FilteringTariffsByGigabytes());
        menu.add(new FilteringTariffByMinutes());
    }
    public void specialDisplaying(int command){
        menu.get(command).displayTariffsSpecially();
    }
}
