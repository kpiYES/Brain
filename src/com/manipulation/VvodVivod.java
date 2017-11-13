package com.manipulation;

import java.io.*;

public class VvodVivod {
 public static void main(String[] args) {
        int i;
        FileInputStream f;
        File file = new File("C:\\Users\\Misha\\Desktop\\Test.txt");


        // Попытка открыть файл
        try {
            f = new FileInputStream(file);

            //Попытка прочитать файл
            try {
                do {
                    i = f.read();
                    if (i != -1) System.out.print((char) i);
                } while (i != -1);
            } catch (IOException e) {
                System.out.println("Файл не удалось прочитать" + e);
            }
            try{
                f.close();
            } catch (IOException e) {
                System.out.println("Файл не удалось закрыть" + e);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не удалось открыть" + e);

        }


    }
}