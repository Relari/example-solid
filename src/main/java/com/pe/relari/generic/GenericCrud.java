package com.pe.relari.generic;

import java.util.List;

public interface GenericCrud <T, I> {

    void save(T value);
    T findById(I id);
    List<T> findAll();
    void deleteById(I id);
    void update(I id, T value);

}
