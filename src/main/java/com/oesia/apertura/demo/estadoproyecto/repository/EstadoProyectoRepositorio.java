package com.oesia.apertura.demo.estadoproyecto.repository;

import com.oesia.apertura.demo.estadoproyecto.entities.EstadoProyectoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoProyectoRepositorio extends JpaRepository<EstadoProyectoEntity, Long> {
}
