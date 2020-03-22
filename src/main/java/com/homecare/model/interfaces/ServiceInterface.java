package com.homecare.model.interfaces;

import java.util.List;

public interface ServiceInterface<T> {
    T getById(Long id);
    List<T> getAll();
}
