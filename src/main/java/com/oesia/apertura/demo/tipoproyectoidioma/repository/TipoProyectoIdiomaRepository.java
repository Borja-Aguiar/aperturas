package com.oesia.apertura.demo.tipoproyectoidioma.repository;

import com.oesia.apertura.demo.tipoproyecto.entities.TipoProyectoEntity;
import com.oesia.apertura.demo.tipoproyectoidioma.entities.TipoProyectoIdiomaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoProyectoIdiomaRepository extends JpaRepository<TipoProyectoIdiomaEntity, Long> {
}
