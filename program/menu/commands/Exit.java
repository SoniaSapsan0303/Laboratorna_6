package com.program.menu.commands;
public class Exit implements MenuExecute{
    @Override
    public void execute() {
        System.out.println("It was nice to see you here!");
        System.exit(0);
    }
}
