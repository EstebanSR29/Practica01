package com.practica01.service.impl;

import com.practica01.dao.EstadoDao;
import com.practica01.domain.Estado;
import com.practica01.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoServiceImpl implements EstadoService {
    
    @Autowired
    private final EstadoDao estadoDao;
    
    public EstadoServiceImpl(EstadoDao estadoDao) {
        this.estadoDao = estadoDao;
    }

    @Override
    public List<Estado> obtenerTodosEstados() {
        return estadoDao.findAll();
    }


    @Override
    public Estado crearEstado(Estado estado) {
        return estadoDao.save(estado);
    }

    @Override
    public Estado actualizarEstado(Estado estado) {
        return estadoDao.save(estado);
    }

    @Override
    public void eliminarEstado(Long id) {
        estadoDao.deleteById(id);
    }
}
