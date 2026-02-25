package com.renzogtr.gestion_estudiantes.repository;

import com.renzogtr.gestion_estudiantes.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {
}
