package com.program.mainmenu;
import com.program.menu.commands.*;
import java.util.ArrayList;
import java.util.List;
public class MainMenu {
    private final List<MenuExecute> menu = new ArrayList<>();
        public MainMenu(){
            menu.add(new Exit());
            menu.add(new ShowAllTariff());
            menu.add(new AmountOfUsers());
            menu.add(new AddNewTariff());
            menu.add(new SpecialDisplay());
            menu.add(new OpenTariffMenu());
        }
        public void execute(int command){
            menu.get(command).execute();
        }
}


