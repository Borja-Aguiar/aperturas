package com.oesia.apertura.demo.obra.repository;

import com.oesia.apertura.demo.obra.entities.ObraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObraRepository extends JpaRepository<ObraEntity, Long> {
}
