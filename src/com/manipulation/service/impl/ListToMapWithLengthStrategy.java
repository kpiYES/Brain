package com.manipulation.service.impl;

import com.manipulation.service.ListToMapStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMapWithLengthStrategy implements ListToMapStrategy<String, Integer> {

    @Override
    public Map<String, Integer> transform(List<String> entity) {
        Map<String, Integer> map = new HashMap<>();
        for (String line : entity) {

            map.put(line,line.length());

            }
        return map;
    }
}
