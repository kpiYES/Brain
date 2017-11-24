package com.manipulation.service.impl;

import com.manipulation.service.ListToMapStrategy;
import com.manipulation.util.MapUtil;

import java.util.*;

public class ListToMapWithLengthStrategy implements ListToMapStrategy<String, Integer> {

    @Override
    public Map<String, Integer> transform(List<String> entity) {
        Map<String, Integer> map = new HashMap<>();
        for (String line : entity) {
            map.put(line, line.length());
        }
        return MapUtil.sortbyvalues(map);
    }
}
