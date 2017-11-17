package com.manipulation.service;

import java.io.File;
import java.util.List;

public interface ReadService {
    List<String> readLinesToList(String path);

    List<String> readLinesToList(File file);

}

