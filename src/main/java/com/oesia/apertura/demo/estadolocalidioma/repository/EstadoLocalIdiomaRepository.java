package com.oesia.apertura.demo.estadolocalidioma.repository;

import com.oesia.apertura.demo.alcanceobraidioma.entities.AlcanceObraIdiomaEntity;
import com.oesia.apertura.demo.estadolocalidioma.entities.EstadoLocalIdiomaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoLocalIdiomaRepository extends JpaRepository<EstadoLocalIdiomaEntity, Long> {
}
