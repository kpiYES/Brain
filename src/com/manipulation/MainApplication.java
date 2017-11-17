package com.manipulation;

import com.manipulation.app.Application;

import java.io.File;

public class MainApplication {

    public static void main(String[] args) {
        Application app = new Application();
        File file = new File("C:\\Users\\Misha\\Desktop\\Test.txt");
        app.executeRead(file);
    }
}


