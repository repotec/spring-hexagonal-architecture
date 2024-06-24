package com.ahd.adapters.mapper;


public interface BasicMapper<D,E> {
    D entityToDto(E entity);
    E dtoToEntity(D dto);
}
