package com.manipulation.service.impl;

import com.manipulation.service.ReadService;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractReadService implements ReadService {

    protected List<String> arr = new ArrayList<>();

    public List<String> readLinesToList(String path) {
        File file = new File(path);
        writeToList(file);
        return (arr);
    }

    public List<String> readLinesToList(File file) {
        writeToList(file);
        return (arr);
    }

    protected abstract List<String> writeToList(File file);
}
