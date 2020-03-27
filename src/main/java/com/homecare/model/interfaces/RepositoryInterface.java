package com.homecare.model.interfaces;

import java.util.List;

public interface RepositoryInterface<T> {
    T getById(Long id);

    List<T> getAll();

    void delete(T entity);

    T update(T entity);

    T save(T entity);
}
