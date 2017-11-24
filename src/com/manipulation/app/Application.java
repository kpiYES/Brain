package com.manipulation.app;

import com.manipulation.service.*;


import java.io.File;
import java.util.*;

public class Application {
    private ReadService readService;
    private ListToMapStrategy<String, Integer> transformService;
    private PrintMapStrategy<String, Integer> printService;

    public Application(ReadService readService,
                       ListToMapStrategy<String, Integer> transformService,
                       PrintMapStrategy<String, Integer> printService) {

        this.readService = readService;
        this.transformService = transformService;
        this.printService = printService;
    }

    public void execute(File file) {
        List<String> arr = readService.readLinesToList(file);
        Map<String, Integer> tmap = transformService.transform(arr);
        printService.print(tmap);
    }
}


