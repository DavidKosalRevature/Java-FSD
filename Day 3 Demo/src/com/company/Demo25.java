package com.company;

import java.io.FileOutputStream;

public class Demo25 {
    public static void main(String[] args) {
        //try block to check for exception
        try(FileOutputStream stream = new FileOutputStream(("C:\\data.txt"))) //creating an object of fileOutputStream
        {
            // custom string input
            String data = "Hello World";

            // convert string to bytes
            byte[] array = data.getBytes();

            // text written in the files
            stream.write(array);
        }

        // catch block to handle exception
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("resource are closed");

    }
}
