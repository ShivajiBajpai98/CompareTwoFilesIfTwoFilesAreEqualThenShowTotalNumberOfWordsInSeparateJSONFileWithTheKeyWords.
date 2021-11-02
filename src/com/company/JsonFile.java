package com.company;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonFile
{
    public  void  jasonOperation() throws IOException {
    boolean b= true;
        Object files =new FileOne();
    CompareTextFiles compareTextFiles = new CompareTextFiles();
        if (b == compareTextFiles.compareTextFiles())
        {
            Gson gson = new Gson();
           // Object fileOne =new FileOne();
            String string = gson.toJson(files);
            System.out.println(string);


            try {
                FileWriter file = new FileWriter("D:/output.json");
                file.write(string);
                file.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("JSON file created: " + string);


        }
        else
    {
        System.out.println("Files are not equal");
    }
    }
}
