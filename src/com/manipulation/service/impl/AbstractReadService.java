package com.manipulation.service.impl;

import com.manipulation.service.ReadService;

import java.io.File;
import java.util.*;

public abstract class AbstractReadService implements ReadService {

    public List<String> readLinesToList(String path) {
        File file = new File(path);
        return writeToList(file);
    }

    public List<String> readLinesToList(File file) {
        return writeToList(file);
    }

    protected abstract List<String> writeToList(File file);
}
