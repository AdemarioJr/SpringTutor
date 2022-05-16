package com.springtutor.demobasic.repository;

import com.springtutor.demobasic.entity.Documento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {

}
