package com.company.Views;

public class CmdLineView {

    private String[] names;

    public CmdLineView(String[] names) {
        this.names = names;
    }

    //display each name and grade on a new line
    public void displayGrades(String[] names){
        for(String name : names){
            System.out.print(name);
            System.out.print("\n");
        }
    }
}
