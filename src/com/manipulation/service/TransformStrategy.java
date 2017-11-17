package com.manipulation.service;


public interface TransformStrategy<T, S> {
    S transform(T entity);
}
