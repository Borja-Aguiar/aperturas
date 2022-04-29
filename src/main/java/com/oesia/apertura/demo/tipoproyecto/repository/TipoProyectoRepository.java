package com.oesia.apertura.demo.tipoproyecto.repository;

import com.oesia.apertura.demo.tipoproyecto.entities.TipoProyectoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoProyectoRepository extends JpaRepository<TipoProyectoEntity, Long> {
}
