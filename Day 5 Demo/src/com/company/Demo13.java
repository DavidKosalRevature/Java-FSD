package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo13 {
    public static void main(String[] args) throws IOException {
        File dir = new File("db");
        dir.mkdir();

        File file = new File("db", "second.txt");
        try{
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //it will first check do we have a file by this name
        //or it will create a new file
        FileWriter fw = new FileWriter("data2.txt", true);
        fw.write(10);
        fw.write("This is some message222111");
        fw.write("\n");
        char[] c1 = {'a','b','c'};
        fw.write(c1);
        fw.write("\n");

        fw.flush();
        fw.close();
    }
}
