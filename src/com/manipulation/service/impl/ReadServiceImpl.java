package com.manipulation.service.impl;

import java.io.*;
import java.util.*;


public class ReadServiceImpl implements com.manipulation.service.ReadService {

    List<String> arr = new ArrayList<>();

    public List<String> readLinesToList(String path) {
        File file = new File(path);
        writeToList(file);
        return (arr);
    }

    public List<String> readLinesToList(File file) {
        writeToList(file);
        return (arr);
    }

    private List<String> writeToList(File file) {
        String s;
        try (
                FileInputStream f = new FileInputStream(file);
                BufferedReader br = new BufferedReader(new InputStreamReader(f))) {

            while ((s = br.readLine()) != null) {
                arr.add(s);
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка ввода/тения данных " + file.getName(), e);
        }
        return (arr);

    }
}

