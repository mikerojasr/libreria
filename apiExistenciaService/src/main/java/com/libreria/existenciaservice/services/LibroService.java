package com.libreria.existenciaservice.services;

import java.util.ArrayList;
import java.util.Optional;

import com.libreria.existenciaservice.models.LibroModel;
import com.libreria.existenciaservice.repositories.LibroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    @Autowired
    LibroRepository LibroRepository;
    
    public ArrayList<LibroModel> obtenerLibros(){
        return (ArrayList<LibroModel>) LibroRepository.findAll();
    }

    public Optional<LibroModel> obtenerLibroPorId(Long id){
        return LibroRepository.findById(id);
    }
    
    public ArrayList<LibroModel>  obtenerPorNombre(String nombre) {
        return LibroRepository.findByNombre(nombre);
    }
}