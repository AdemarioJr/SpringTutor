package com.springtutor.demobasic.service;

import java.util.List;
import java.util.Optional;

import com.springtutor.demobasic.entity.Produto;
import com.springtutor.demobasic.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    public void deletarPorId(Long id) {
        produtoRepository.deleteById(id);
    }
}
