package com.manipulation.app;

import com.manipulation.service.*;
import com.manipulation.service.impl.*;
import com.manipulation.util.MapUtil;

import java.io.File;
import java.util.*;


public class Application {
    public void executeRead(String path) {
        ReadService r = new ReadServiceImpl();
        List<String> arr = r.readLinesToList(path);
        executeRemain(arr);
    }

    public void executeRead(File file){
        ReadService r = new ReadServiceImpl();
        List<String> arr = r.readLinesToList(file);
        executeRemain(arr);
    }
    public void executeRemain(List<String> arr){
        ListToMapStrategy<String, Integer> t = new ListToMapStrategyImpl();
        Map<String, Integer> map = t.transform(arr);
        Map<String, Integer> tmap = MapUtil.sortbyvalues(map);
        PrintMapStrategy<String, Integer> p = new PrintMapStrategyImpl<>();
        p.print(tmap);
    }
}

