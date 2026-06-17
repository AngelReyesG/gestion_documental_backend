package com.tgm.service;

import com.tgm.model.Oficio;
import com.tgm.repository.OficioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OficioService {

    @Autowired
    private OficioRepository oficioRepository;

    //Listar oficios
    public List<Oficio> obtenerTodos() {
        return oficioRepository.findAll();
    }

    //Buscar oficio por ID
    public Optional<Oficio> obtenerPorId(int id) {
        return oficioRepository.findById(id);
    }

    //Crear o actualizar oficio
    public Oficio guardar(Oficio oficio) {
        return oficioRepository.save(oficio);
    }

    //Eliminar un oficio
    public void eliminar (int id) {
        oficioRepository.deleteById(id);
    }

    //Buscador dinámico
    public List<Oficio> buscarPorCriterio(String criterio) {
        return oficioRepository.findByFolioContainingIgnoreCaseOrAsuntoContainingIgnoreCase(criterio, criterio);
    }

    //Cambiar estado de un oficio
    public boolean actualizarEstado(int id, String nuevoEstado) {
        Optional<Oficio> o = oficioRepository.findById(id);
        if (o.isPresent()) {
            Oficio oficio = o.get();
            oficio.setEstado(nuevoEstado);
            oficioRepository.save(oficio);
            return true;
        }
        return false;
    }
}
