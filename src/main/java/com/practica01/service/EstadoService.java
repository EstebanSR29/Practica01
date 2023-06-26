package com.practica01.service;

import com.practica01.domain.Estado;
import java.util.List;

public interface EstadoService {

    List<Estado> obtenerTodosEstados();

    Estado crearEstado(Estado estado);

    Estado actualizarEstado(Estado estado);

    void eliminarEstado(Long id);
}