package com.company;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class AppRun {
    public static void main(String[] args) throws IOException {


        FileOne fileOne = new FileOne();
        fileOne.fileCreate();
        fileOne.fileWrite();
        fileOne.fileRead();
        fileOne.count();

        FileTwo fileTwo = new FileTwo();
        fileTwo.fileCreate();
        fileTwo.fileWrite();
        fileTwo.fileRead();
        fileTwo.count();


        boolean b = true;
        CompareTextFiles compareTextFiles = new CompareTextFiles();
        if (b == compareTextFiles.compareTextFiles()) {
            Gson gson = new Gson();
            String string = gson.toJson(fileOne);
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


        } else {
            System.out.println("Files are not equal");
        }

    }
}