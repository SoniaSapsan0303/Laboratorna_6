package com.program.tariffmenu;
import com.program.mobilecompany.MobileCompany;
import java.util.ArrayList;
import java.util.List;
public class ChooseOptionTariffMenu extends MobileCompany {
    private final List<MenuTariff> menu = new ArrayList<>();
    public ChooseOptionTariffMenu(){
        menu.add(new AddTariffToRoaming());
        menu.add(new DeleteTariff());
        menu.add(new EditTariff());
    }
    public void opentTariffMenu(int command){
        menu.get(command).doTariffMenu();
    }
}