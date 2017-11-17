package com.manipulation.app;


import com.manipulation.service.impl.*;
import com.manipulation.service.*;
import com.manipulation.util.MapUtil;

import java.util.*;

public class MainApplication {

    public static void main(String[] args) {
        ReadService r = new ReadServiceImpl();
        List<String> arr = r.readLinesToList("C:\\Users\\Misha\\Desktop\\Test.txt");
        ListToMapStrategy<String, Integer> t = new ListToMapStrategyImpl();
        Map<String, Integer> map = t.transform(arr);
        Map<String, Integer> tmap = MapUtil.sortbyvalues(map);
        PrintMapStrategy<String, Integer> p = new PrintMapStrategyImpl<>();
        p.print(tmap);
    }
}
