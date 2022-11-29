package com.program.menu.commands;
import com.program.specialdisplayingoftariffs.*;
import java.util.Scanner;
public class SpecialDisplay implements MenuExecute{
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        ChooseTheWayHowToDisplayTariffs menu = new ChooseTheWayHowToDisplayTariffs();
        boolean incorrectEnter = false;
        int command;
        do {
            System.out.println("Please, enter the next action:");
            showMenuisplayingTariffs();
            try {
                command = Integer.parseInt(scanner.nextLine());
                if (command >= 0 && command <= 2) {
                   menu.specialDisplaying(command);
                } else {
                    throw new Exception();
                }
            } catch (Exception error) {
                System.out.println("try again... 0 - 2");
                incorrectEnter = true;
            }
        }while(incorrectEnter);
    }
    private void showMenuisplayingTariffs(){
        System.out.print("""
                \n\t[0] - sort by price
                \t[1] - filtering by gigabytes
                \t[2] - filtering by minutes
   
                Enter command :\t""");
    }
}
