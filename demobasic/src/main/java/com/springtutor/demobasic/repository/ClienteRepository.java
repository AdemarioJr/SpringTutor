package com.springtutor.demobasic.repository;

import com.springtutor.demobasic.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
