package com.renzogtr.gestion_estudiantes.controller;


import com.renzogtr.gestion_estudiantes.model.Estudiante;
import com.renzogtr.gestion_estudiantes.service.EstudianteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    private final EstudianteService service;


    public EstudianteController(EstudianteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Estudiante> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> buscarPorId(@PathVariable Long id){
        Estudiante estudiante = service.buscarPorId(id);
        if (estudiante == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(estudiante);
    }

    @PostMapping
    public Estudiante guardar(@RequestBody Estudiante estudiante){
        return service.guardar(estudiante);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }

}
