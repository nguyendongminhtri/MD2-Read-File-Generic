package com.company.service;

import java.io.IOException;
import java.util.List;

public interface IServiceGeneric<T> {
    List<T> findAll() throws IOException;
    void save(T t) throws IOException;
    T findById(int id);
}
