package com.manipulation;

import java.io.*;
import java.util.*;


public class Manipulation {


    public static void main(String[] args) {
        String s;
        List<String> arr = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        File file = new File("C:\\Users\\Misha\\Desktop\\Test.txt");
        try (
                FileInputStream f = new FileInputStream(file);
                BufferedReader br = new BufferedReader(new InputStreamReader(f))) {

            while ((s = br.readLine()) != null) {
                arr.add(s);
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка ввода/тения данных " + file.getName(), e);
        }

        for (String line : arr) {

            if (!map.containsKey(line)) {
                map.put(line, 1);
            } else {
                map.put(line, map.get(line) + 1);
            }
        }
        Map<String, Integer> sortbyvalues = sortbyvalues(map);
        Set<Map.Entry<String, Integer>> set = sortbyvalues.entrySet();
        for (Map.Entry<String,Integer> a : set) {
            System.out.println(a.getKey() + " " + a.getValue());
        }
    }

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
        Map<K, V> tmap = new TreeMap<K, V>(comparator);
        tmap.putAll(m);
        return tmap;
    }


}







