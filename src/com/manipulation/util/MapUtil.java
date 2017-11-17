package com.manipulation.util;

import java.util.*;

public class MapUtil {

    public static <K, V extends Comparable<V>> Map<K, V> sortbyvalues(Map<K, V> m) {

        Comparator<K> comparator = new Comparator<K>() {
            @Override
            public int compare(K o1, K o2) {
                if (m.get(o1).compareTo(m.get(o2)) >= 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
        Map<K, V> tmap = new TreeMap<>(comparator);
        tmap.putAll(m);
        return tmap;
    }


}


