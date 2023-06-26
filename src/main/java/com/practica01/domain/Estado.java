package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")
public class Estado implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    
    private String nombre;
    private String capital;
    private int poblacion;
    
    @Column(name = "tiene_costas")
    private boolean tieneCostas;

    public Estado() {
    }

    public Estado(String nombre, String capital, int poblacion, boolean tieneCostas) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.tieneCostas = tieneCostas;
    }
}
