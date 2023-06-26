package com.practica01.controller;

import com.practica01.domain.Estado;
import com.practica01.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoController {

    private final EstadoService estadoService;

    @Autowired
    public EstadoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @GetMapping
    public List<Estado> obtenerTodosEstados() {
        return estadoService.obtenerTodosEstados();
    }

    @PostMapping
    public Estado crearEstado(@RequestBody Estado estado) {
        return estadoService.crearEstado(estado);
    }

    @PutMapping("/{id}")
    public Estado actualizarEstado(@PathVariable Long id, @RequestBody Estado estado) {
        estado.setId(id);
        return estadoService.actualizarEstado(estado);
    }

    @DeleteMapping("/{id}")
    public void eliminarEstado(@PathVariable Long id) {
        estadoService.eliminarEstado(id);
    }
}
