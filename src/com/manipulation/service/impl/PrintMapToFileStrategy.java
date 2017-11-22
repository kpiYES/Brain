package com.manipulation.service.impl;

import com.manipulation.service.PrintMapStrategy;

import java.io.*;
import java.util.Map;
import java.util.Set;

public class PrintMapToFileStrategy<K, V> implements PrintMapStrategy<K, V> {
    @Override
    public void print(Map<K, V> tmap) {

        File file = new File("C:\\Users\\Misha\\Desktop\\Result.txt");
        String b;
        Set<Map.Entry<K, V>> set = tmap.entrySet();
        String lineSeparator = System.getProperty("line.separator");
        try (FileWriter r = new FileWriter(file)) {

            for (Map.Entry<K, V> a : set) {
                b = a.getKey() + " " + a.getValue() + lineSeparator;
                r.write(b);
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка вывода данных в файл " + file.getName(), e);
        }
    }
}
