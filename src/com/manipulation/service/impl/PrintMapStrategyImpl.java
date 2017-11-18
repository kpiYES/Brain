package com.manipulation.service.impl;

import com.manipulation.service.PrintMapStrategy;

import java.util.Map;
import java.util.Set;

public class PrintMapStrategyImpl<K, V> implements PrintMapStrategy<K, V> {

    public void print(Map<K, V> tmap) {
        Set<Map.Entry<K, V>> set = tmap.entrySet();
        for (Map.Entry<K, V> a : set) {
            System.out.println(a.getKey() + " " + a.getValue());
        }

    }
}
