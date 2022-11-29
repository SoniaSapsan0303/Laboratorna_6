package com.program.menu.commands;
import com.program.tariffmenu.*;
import java.util.Scanner;
public class OpenTariffMenu implements MenuExecute{
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        ChooseOptionTariffMenu menu = new ChooseOptionTariffMenu();
        boolean incorrectEnter = false;
        int command;
        do {
            System.out.println("Please, enter the next action:");
            showTariffMenu();
            try {
                command = Integer.parseInt(scanner.nextLine());
                if (command >= 0 && command <= 2) {
                    menu.opentTariffMenu(command);
                } else {
                    throw new Exception();
                }
            } catch (Exception error) {
                System.out.println("try again... 0 - 2");
                incorrectEnter = true;
            }
        }while(incorrectEnter);

    }
    private void showTariffMenu(){
        System.out.print("""
                \n\t[0] - subscribe tariff to roaming
                \t[1] - delete tariff
                \t[2] - edit tariff
   
                Enter command :\t""");
    }
}