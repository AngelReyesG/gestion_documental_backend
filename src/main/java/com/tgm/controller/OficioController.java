package com.tgm.controller;

import com.tgm.model.Oficio;
import com.tgm.service.OficioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/oficios")
@CrossOrigin(origins = "*")
public class OficioController {

    @Autowired
    private OficioService oficioService;

    //Obtener todos los oficios
    @GetMapping
    public List<Oficio> listarTodos() {
        return oficioService.obtenerTodos();
    }

    //Obtener oficio por id
    @GetMapping ("/{id}")
    public ResponseEntity<Oficio> obtenerPorId(@PathVariable int id) {
        Optional<Oficio> oficio = oficioService.obtenerPorId(id);
        return oficio.map(ResponseEntity :: ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Buscador dinámico
    @GetMapping("/buscar")
    public List<Oficio> buscar(@RequestParam String criterio) {
        return oficioService.buscarPorCriterio (criterio);
    }

    //Crear nuevo oficio
    @PostMapping
    public Oficio crear(@RequestBody Oficio oficio) {
        return oficioService.guardar(oficio);
    }

    //Actualizar estado
    @PutMapping("/{id}/estado")
    public ResponseEntity<String> cambiarEstado(@PathVariable int id, @RequestParam String nuevoEstado) {
        boolean actualizado = oficioService.actualizarEstado(id, nuevoEstado);
        if (actualizado) {
            return ResponseEntity.ok("Estado actualiado correctamente a: " + nuevoEstado);
        }
        return ResponseEntity.notFound().build();
    }

    //Eliminar oficio
    @DeleteMapping
    public ResponseEntity<Void> eliminar(@PathVariable int id) {
        oficioService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
