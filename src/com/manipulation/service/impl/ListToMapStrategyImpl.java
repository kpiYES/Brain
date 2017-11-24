package com.manipulation.service.impl;

import com.manipulation.service.*;
import com.manipulation.util.MapUtil;

import java.util.*;

public class ListToMapStrategyImpl implements ListToMapStrategy<String, Integer> {

    @Override
    public Map<String, Integer> transform(List<String> entity) {

        Map<String, Integer> map = new HashMap<>();

        for (String line : entity) {

            if (!map.containsKey(line)) {
                map.put(line, 1);
            } else {
                map.put(line, map.get(line) + 1);
            }
        }
        return MapUtil.sortbyvalues(map);
    }
}
