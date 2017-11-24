package com.manipulation;

import com.manipulation.app.Application;
import com.manipulation.service.*;
import com.manipulation.service.impl.*;

import java.io.File;

public class MainApplication {

    public static void main(String[] args) {
        ReadService readService = new ReadServiceImpl();
        ListToMapStrategy<String, Integer> transformService = new ListToMapWithLengthStrategy();
        PrintMapStrategy<String, Integer> printService = new PrintMapToFileStrategy<>();
        Application app = new Application(readService, transformService, printService);
        File file = new File("C:\\Users\\Misha\\Desktop\\Test.txt");
        app.execute(file);
    }
}


