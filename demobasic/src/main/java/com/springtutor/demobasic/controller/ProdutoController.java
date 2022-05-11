package com.springtutor.demobasic.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.springtutor.demobasic.entity.Produto;
import com.springtutor.demobasic.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;

/**
 * ProdutoController
 */
@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    public ProdutoController() {
        this.produtoService = new ProdutoService();
    }

    @GetMapping(value = "/status", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public String status() {
        return "Resource activate produto :-) ";
    }

    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Produto>> getAll() {
        try {
            List<Produto> items = new ArrayList<Produto>();
            produtoService.listarProdutos().forEach(items::add);

            if (items.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
