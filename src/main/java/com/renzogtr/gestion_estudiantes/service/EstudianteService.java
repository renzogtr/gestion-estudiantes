package com.renzogtr.gestion_estudiantes.service;


import com.renzogtr.gestion_estudiantes.model.Estudiante;
import com.renzogtr.gestion_estudiantes.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    
    private final EstudianteRepository repository;

    public EstudianteService(EstudianteRepository repository) {
        this.repository = repository;
    }
    
    public List<Estudiante> listarTodos(){
        return repository.findAll();
    }
    
    public Estudiante guardar(Estudiante estudiante){
        return repository.save(estudiante);
    }
    
    public void eliminar(Long id){
        repository.deleteById(id);
    }
    
    public Estudiante buscarPorId(Long id){
        return repository.findById(id).orElse(null);
    }
    
}
