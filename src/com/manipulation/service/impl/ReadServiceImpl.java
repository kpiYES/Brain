package com.manipulation.service.impl;

import java.io.*;
import java.util.*;


public class ReadServiceImpl implements com.manipulation.service.ReadService {
    String path;
    File file;

    public List<String> readLinesToList(String path) {
        this.path = path;
        String s;
        List<String> arr = new ArrayList<>();

        this.file = new File(path);

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

    public List<String> readLinesToList(File file) {
        this.file = file;
        String s;
        List<String> arr = new ArrayList<>();
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

