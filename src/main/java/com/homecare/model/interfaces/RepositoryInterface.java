package com.homecare.model.interfaces;

import java.util.List;

public interface RepositoryInterface<T> {
    T getById(Long id);

    List<T> getAll();

    void delete(Long id);

    T update(T entity);

    T save(T entity);
}
