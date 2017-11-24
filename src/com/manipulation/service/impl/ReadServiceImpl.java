package com.manipulation.service.impl;

import java.io.*;
import java.util.*;


public class ReadServiceImpl extends AbstractReadService implements com.manipulation.service.ReadService {


    protected List<String> writeToList(File file) {
        List<String> arr = new ArrayList<>();
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

