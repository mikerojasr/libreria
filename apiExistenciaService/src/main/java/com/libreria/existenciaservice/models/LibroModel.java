package com.libreria.existenciaservice.models;

import javax.persistence.*;

@Entity
@Table(name = "libro")
public class LibroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String isbn;
    private Integer existencia;

    public void setExistencia(Integer existencia){
        this.existencia = existencia;
    }

    public Integer getExistencia(){
        return existencia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
}