package com.manipulation.service.impl;

import com.manipulation.service.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMapStrategyImpl implements ListToMapStrategy<String, Integer> {

    public Map<String, Integer> transform(List<String> entity) {

        Map<String, Integer> map = new HashMap<>();
        List<String> arr;

        arr = entity;
        for (String line : arr) {

            if (!map.containsKey(line)) {
                map.put(line, 1);
            } else {
                map.put(line, map.get(line) + 1);
            }

        }
        return map;
    }


}
