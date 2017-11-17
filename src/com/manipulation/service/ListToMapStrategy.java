package com.manipulation.service;


import java.util.List;
import java.util.Map;

public interface ListToMapStrategy<K, V> extends TransformStrategy<List<K>, Map<K, V>> {
}