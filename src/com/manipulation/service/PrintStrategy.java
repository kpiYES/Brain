package com.manipulation.service;

public interface PrintStrategy<T> {
    void print(T entity);
}
