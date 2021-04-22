package com.libreria.existenciaservice.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.libreria.existenciaservice.models.LibroModel;
import com.libreria.existenciaservice.services.LibroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Libro")
public class LibroController {
    @Autowired
    LibroService LibroService;

    @GetMapping()
    public ArrayList<LibroModel> obtenerLibros(){
        return LibroService.obtenerLibros();
    }

    @GetMapping( path = "/{id}")
    public Optional<LibroModel> obtenerLibroPorId(@PathVariable("id") Long id) {
        return this.LibroService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<LibroModel> obtenerLibroPorPrioridad(@RequestParam("nombre") String nombre){
        return this.LibroService.obtenerPorNombre(nombre);
    }    

}