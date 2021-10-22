package com.company.Controllers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GetNames {

    private String[] names;
    private BufferedReader in;

    public GetNames(){

        try {
            //create file path in files folder
            Path filePath = Paths.get("files/", "gradeNames.txt");

            in = new BufferedReader(new FileReader(String.valueOf(filePath)));
            //create array list since length can be variable
            List<String> lines = new ArrayList<String>();
            String line = null;

            try {
                line = in.readLine();

                //read in each line
                while(line != null){
                    lines.add(line);
                    line = in.readLine();
                }

                //close the file to reduce overhead
                in.close();

                //convert array list to array
                names = lines.toArray(new String[lines.size()]);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String[] getNames() {
        return names;
    }
}

