package com.oesia.apertura.demo.estadolocal.repository;

import com.oesia.apertura.demo.estadolocal.entities.EstadoLocalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoLocalRepository extends JpaRepository<EstadoLocalEntity, Long> {
}
