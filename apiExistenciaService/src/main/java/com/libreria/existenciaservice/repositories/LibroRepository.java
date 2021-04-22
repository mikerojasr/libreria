package com.libreria.existenciaservice.repositories;

import java.util.ArrayList;

import com.libreria.existenciaservice.models.LibroModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends CrudRepository<LibroModel, Long> {
    public abstract ArrayList<LibroModel> findByNombre(String nombre);

}