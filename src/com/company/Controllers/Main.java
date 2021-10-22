package com.company.Controllers;

import com.company.Views.CmdLineView;

import java.util.Random;

public class Main {

    public static CmdLineView view;

    public static void main(String[] args) {

        //create GetNames object, reading file
        GetNames nameList = new GetNames();
        //create array of names
        String[] names = nameList.getNames();

        //add random percentage and letter grade to each name
        for (int i = 0; i < names.length; i++){
            names[i] = assignGrades(names[i]);
        }

        //display the new list of names and grades to the user
        view = new CmdLineView(names);
        view.displayGrades(names);
    }

    //function that gets a random percentage and assigns the corresponding letter grade
    private static String assignGrades(String name) {
            int percentage = new Random().nextInt(101);
            if (percentage < 60) {
                name =  name + " " + percentage + "% " + "F";
            } else if (percentage >= 60 && percentage < 70) {
                name =  name + " " + percentage + "% " + "D";
            } else if (percentage >= 70 && percentage < 80) {
                name =  name + " " + percentage + "% " + "C";
            } else if (percentage >= 80 && percentage < 90) {
                name =  name + " " + percentage + "% " + "B";
            } else if (percentage >= 90) {
                name =  name + " " + percentage + "% " + "A";
            }
            return name;
    }
}
