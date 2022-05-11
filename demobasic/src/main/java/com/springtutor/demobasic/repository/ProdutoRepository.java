package com.springtutor.demobasic.repository;

import com.springtutor.demobasic.entity.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
